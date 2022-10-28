package via.sdj3.grpcspringbootx.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.grpcspringbootx.model.Animal;
import via.sdj3.grpcspringbootx.model.Product;
import via.sdj3.grpcspringbootx.protobuf.RequestText;
import via.sdj3.grpcspringbootx.protobuf.ResponseText;
import via.sdj3.grpcspringbootx.protobuf.TextConverterGrpc;
import via.sdj3.grpcspringbootx.repository.DaoInterface;
import via.sdj3.grpcspringbootx.repository.RepositoryTest;

import java.lang.reflect.Array;
import java.util.ArrayList;

@GRpcService
public class TextConverterImpl extends TextConverterGrpc.TextConverterImplBase {

   private final DaoInterface db = RepositoryTest.getInstance();



    @Override
    public void getAnimalsByProductId(RequestText request, StreamObserver<ResponseText> responseObserver) {
        // super.toUpper(request, responseObserver);
        System.out.println("Request animals in product ====> " + request.toString());
        int id =request.getInputText();
        ArrayList<Animal> result = db.getByProductId(id);
        if (result==null){
            ResponseText responseText = ResponseText.newBuilder().setOutputText("no prudct with that it").build();
        }


          ResponseText  responseText = ResponseText.newBuilder()
                    .setOutputText(result.toString()).build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();

    }

    @Override
    public void getProductByAnimalId(RequestText request, StreamObserver<ResponseText> responseObserver) {
        // super.capitalizeFirstCharacter(request, responseObserver);
        System.out.println("Received Request ====> " + request.toString());
        ArrayList<Product> result = db.getByAnimalId(request.getInputText());
        ResponseText responseText = ResponseText.newBuilder()
                .setOutputText(result.toString()).build();
        responseObserver.onNext(responseText);
        responseObserver.onCompleted();
    }
}
