package via.sdj3.grpcspringbootx.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.grpcspringbootx.model.Animal;
import via.sdj3.grpcspringbootx.protobuf.RequestText;
import via.sdj3.grpcspringbootx.protobuf.ResponseText;
import via.sdj3.grpcspringbootx.protobuf.TextConverterGrpc;

public class TextConverterClient {
    public static void main(String[] args) {

        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 8084)
                .usePlaintext()
                .build();
        TextConverterGrpc.TextConverterBlockingStub textConverterStub
                = TextConverterGrpc.newBlockingStub(managedChannel);

        RequestText request = RequestText.newBuilder()
                .setInputText(2)
                .build();

        RequestText request2 = RequestText.newBuilder()
                .setInputText(2)
                .build();


        ResponseText response = textConverterStub.getAnimalsByProductId(request);
        System.out.println("Received Response >>>: " + response.getOutputText());

        ResponseText response2 = textConverterStub.getProductByAnimalId(request2);
        System.out.println("Received Response >>>: " + response2.getOutputText());

        managedChannel.shutdown();
    }
}
