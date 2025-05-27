package io.pyserve.inference.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
//@javax.annotation.Generated(
//    value = "by gRPC proto compiler (version 1.72.0)",
//    comments = "Source: inference.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InferenceServiceGrpc {

  private InferenceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.pyserve.inference.v1.InferenceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.pyserve.inference.v1.PredictionRequest,
      io.pyserve.inference.v1.PredictionResponse> getPredictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Predict",
      requestType = io.pyserve.inference.v1.PredictionRequest.class,
      responseType = io.pyserve.inference.v1.PredictionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.pyserve.inference.v1.PredictionRequest,
      io.pyserve.inference.v1.PredictionResponse> getPredictMethod() {
    io.grpc.MethodDescriptor<io.pyserve.inference.v1.PredictionRequest, io.pyserve.inference.v1.PredictionResponse> getPredictMethod;
    if ((getPredictMethod = InferenceServiceGrpc.getPredictMethod) == null) {
      synchronized (InferenceServiceGrpc.class) {
        if ((getPredictMethod = InferenceServiceGrpc.getPredictMethod) == null) {
          InferenceServiceGrpc.getPredictMethod = getPredictMethod =
              io.grpc.MethodDescriptor.<io.pyserve.inference.v1.PredictionRequest, io.pyserve.inference.v1.PredictionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Predict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.pyserve.inference.v1.PredictionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.pyserve.inference.v1.PredictionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InferenceServiceMethodDescriptorSupplier("Predict"))
              .build();
        }
      }
    }
    return getPredictMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InferenceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InferenceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InferenceServiceStub>() {
        @java.lang.Override
        public InferenceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InferenceServiceStub(channel, callOptions);
        }
      };
    return InferenceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static InferenceServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InferenceServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InferenceServiceBlockingV2Stub>() {
        @java.lang.Override
        public InferenceServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InferenceServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return InferenceServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InferenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InferenceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InferenceServiceBlockingStub>() {
        @java.lang.Override
        public InferenceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InferenceServiceBlockingStub(channel, callOptions);
        }
      };
    return InferenceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InferenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InferenceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InferenceServiceFutureStub>() {
        @java.lang.Override
        public InferenceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InferenceServiceFutureStub(channel, callOptions);
        }
      };
    return InferenceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void predict(io.pyserve.inference.v1.PredictionRequest request,
        io.grpc.stub.StreamObserver<io.pyserve.inference.v1.PredictionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPredictMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InferenceService.
   */
  public static abstract class InferenceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InferenceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InferenceService.
   */
  public static final class InferenceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InferenceServiceStub> {
    private InferenceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InferenceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InferenceServiceStub(channel, callOptions);
    }

    /**
     */
    public void predict(io.pyserve.inference.v1.PredictionRequest request,
        io.grpc.stub.StreamObserver<io.pyserve.inference.v1.PredictionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPredictMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InferenceService.
   */
  public static final class InferenceServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<InferenceServiceBlockingV2Stub> {
    private InferenceServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InferenceServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InferenceServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public io.pyserve.inference.v1.PredictionResponse predict(io.pyserve.inference.v1.PredictionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPredictMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service InferenceService.
   */
  public static final class InferenceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InferenceServiceBlockingStub> {
    private InferenceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InferenceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InferenceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.pyserve.inference.v1.PredictionResponse predict(io.pyserve.inference.v1.PredictionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPredictMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InferenceService.
   */
  public static final class InferenceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InferenceServiceFutureStub> {
    private InferenceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InferenceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InferenceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.pyserve.inference.v1.PredictionResponse> predict(
        io.pyserve.inference.v1.PredictionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPredictMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PREDICT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PREDICT:
          serviceImpl.predict((io.pyserve.inference.v1.PredictionRequest) request,
              (io.grpc.stub.StreamObserver<io.pyserve.inference.v1.PredictionResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPredictMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.pyserve.inference.v1.PredictionRequest,
              io.pyserve.inference.v1.PredictionResponse>(
                service, METHODID_PREDICT)))
        .build();
  }

  private static abstract class InferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InferenceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.pyserve.inference.v1.Inference.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InferenceService");
    }
  }

  private static final class InferenceServiceFileDescriptorSupplier
      extends InferenceServiceBaseDescriptorSupplier {
    InferenceServiceFileDescriptorSupplier() {}
  }

  private static final class InferenceServiceMethodDescriptorSupplier
      extends InferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InferenceServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InferenceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InferenceServiceFileDescriptorSupplier())
              .addMethod(getPredictMethod())
              .build();
        }
      }
    }
    return result;
  }
}
