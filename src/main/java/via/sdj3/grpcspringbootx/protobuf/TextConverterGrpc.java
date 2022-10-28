package via.sdj3.grpcspringbootx.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * service definitions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: TextConverter.proto")
public final class TextConverterGrpc {

  private TextConverterGrpc() {}

  public static final String SERVICE_NAME = "TextConverter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetAnimalsByProductIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalsByProductId",
      requestType = via.sdj3.grpcspringbootx.protobuf.RequestText.class,
      responseType = via.sdj3.grpcspringbootx.protobuf.ResponseText.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetAnimalsByProductIdMethod() {
    io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetAnimalsByProductIdMethod;
    if ((getGetAnimalsByProductIdMethod = TextConverterGrpc.getGetAnimalsByProductIdMethod) == null) {
      synchronized (TextConverterGrpc.class) {
        if ((getGetAnimalsByProductIdMethod = TextConverterGrpc.getGetAnimalsByProductIdMethod) == null) {
          TextConverterGrpc.getGetAnimalsByProductIdMethod = getGetAnimalsByProductIdMethod =
              io.grpc.MethodDescriptor.<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalsByProductId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.RequestText.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.ResponseText.getDefaultInstance()))
              .setSchemaDescriptor(new TextConverterMethodDescriptorSupplier("getAnimalsByProductId"))
              .build();
        }
      }
    }
    return getGetAnimalsByProductIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetProductByAnimalIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductByAnimalId",
      requestType = via.sdj3.grpcspringbootx.protobuf.RequestText.class,
      responseType = via.sdj3.grpcspringbootx.protobuf.ResponseText.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetProductByAnimalIdMethod() {
    io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetProductByAnimalIdMethod;
    if ((getGetProductByAnimalIdMethod = TextConverterGrpc.getGetProductByAnimalIdMethod) == null) {
      synchronized (TextConverterGrpc.class) {
        if ((getGetProductByAnimalIdMethod = TextConverterGrpc.getGetProductByAnimalIdMethod) == null) {
          TextConverterGrpc.getGetProductByAnimalIdMethod = getGetProductByAnimalIdMethod =
              io.grpc.MethodDescriptor.<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProductByAnimalId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.RequestText.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.ResponseText.getDefaultInstance()))
              .setSchemaDescriptor(new TextConverterMethodDescriptorSupplier("getProductByAnimalId"))
              .build();
        }
      }
    }
    return getGetProductByAnimalIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextConverterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextConverterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextConverterStub>() {
        @java.lang.Override
        public TextConverterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextConverterStub(channel, callOptions);
        }
      };
    return TextConverterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextConverterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextConverterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextConverterBlockingStub>() {
        @java.lang.Override
        public TextConverterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextConverterBlockingStub(channel, callOptions);
        }
      };
    return TextConverterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextConverterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextConverterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextConverterFutureStub>() {
        @java.lang.Override
        public TextConverterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextConverterFutureStub(channel, callOptions);
        }
      };
    return TextConverterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static abstract class TextConverterImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAnimalsByProductId(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsByProductIdMethod(), responseObserver);
    }

    /**
     */
    public void getProductByAnimalId(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductByAnimalIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAnimalsByProductIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.grpcspringbootx.protobuf.RequestText,
                via.sdj3.grpcspringbootx.protobuf.ResponseText>(
                  this, METHODID_GET_ANIMALS_BY_PRODUCT_ID)))
          .addMethod(
            getGetProductByAnimalIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.grpcspringbootx.protobuf.RequestText,
                via.sdj3.grpcspringbootx.protobuf.ResponseText>(
                  this, METHODID_GET_PRODUCT_BY_ANIMAL_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static final class TextConverterStub extends io.grpc.stub.AbstractAsyncStub<TextConverterStub> {
    private TextConverterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextConverterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextConverterStub(channel, callOptions);
    }

    /**
     */
    public void getAnimalsByProductId(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsByProductIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductByAnimalId(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductByAnimalIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static final class TextConverterBlockingStub extends io.grpc.stub.AbstractBlockingStub<TextConverterBlockingStub> {
    private TextConverterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextConverterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextConverterBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.grpcspringbootx.protobuf.ResponseText getAnimalsByProductId(via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsByProductIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.grpcspringbootx.protobuf.ResponseText getProductByAnimalId(via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductByAnimalIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static final class TextConverterFutureStub extends io.grpc.stub.AbstractFutureStub<TextConverterFutureStub> {
    private TextConverterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextConverterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextConverterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.grpcspringbootx.protobuf.ResponseText> getAnimalsByProductId(
        via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsByProductIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.grpcspringbootx.protobuf.ResponseText> getProductByAnimalId(
        via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductByAnimalIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMALS_BY_PRODUCT_ID = 0;
  private static final int METHODID_GET_PRODUCT_BY_ANIMAL_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextConverterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextConverterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ANIMALS_BY_PRODUCT_ID:
          serviceImpl.getAnimalsByProductId((via.sdj3.grpcspringbootx.protobuf.RequestText) request,
              (io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_ANIMAL_ID:
          serviceImpl.getProductByAnimalId((via.sdj3.grpcspringbootx.protobuf.RequestText) request,
              (io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TextConverterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextConverterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.grpcspringbootx.protobuf.TextConverterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextConverter");
    }
  }

  private static final class TextConverterFileDescriptorSupplier
      extends TextConverterBaseDescriptorSupplier {
    TextConverterFileDescriptorSupplier() {}
  }

  private static final class TextConverterMethodDescriptorSupplier
      extends TextConverterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextConverterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TextConverterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextConverterFileDescriptorSupplier())
              .addMethod(getGetAnimalsByProductIdMethod())
              .addMethod(getGetProductByAnimalIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
