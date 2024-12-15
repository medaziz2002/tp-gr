package combined.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for Hotels
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: combined.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HotelServiceGrpc {

  private HotelServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "combined.grpc.HotelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<combined.grpc.HotelSearchRequest,
      combined.grpc.HotelSearchResponse> getRechercherHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rechercherHotel",
      requestType = combined.grpc.HotelSearchRequest.class,
      responseType = combined.grpc.HotelSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.HotelSearchRequest,
      combined.grpc.HotelSearchResponse> getRechercherHotelMethod() {
    io.grpc.MethodDescriptor<combined.grpc.HotelSearchRequest, combined.grpc.HotelSearchResponse> getRechercherHotelMethod;
    if ((getRechercherHotelMethod = HotelServiceGrpc.getRechercherHotelMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getRechercherHotelMethod = HotelServiceGrpc.getRechercherHotelMethod) == null) {
          HotelServiceGrpc.getRechercherHotelMethod = getRechercherHotelMethod =
              io.grpc.MethodDescriptor.<combined.grpc.HotelSearchRequest, combined.grpc.HotelSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "rechercherHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("rechercherHotel"))
              .build();
        }
      }
    }
    return getRechercherHotelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<combined.grpc.HotelInfoRequest,
      combined.grpc.HotelInfoResponse> getRechercherHotelByInformationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rechercherHotelByInformations",
      requestType = combined.grpc.HotelInfoRequest.class,
      responseType = combined.grpc.HotelInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.HotelInfoRequest,
      combined.grpc.HotelInfoResponse> getRechercherHotelByInformationsMethod() {
    io.grpc.MethodDescriptor<combined.grpc.HotelInfoRequest, combined.grpc.HotelInfoResponse> getRechercherHotelByInformationsMethod;
    if ((getRechercherHotelByInformationsMethod = HotelServiceGrpc.getRechercherHotelByInformationsMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getRechercherHotelByInformationsMethod = HotelServiceGrpc.getRechercherHotelByInformationsMethod) == null) {
          HotelServiceGrpc.getRechercherHotelByInformationsMethod = getRechercherHotelByInformationsMethod =
              io.grpc.MethodDescriptor.<combined.grpc.HotelInfoRequest, combined.grpc.HotelInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "rechercherHotelByInformations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("rechercherHotelByInformations"))
              .build();
        }
      }
    }
    return getRechercherHotelByInformationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<combined.grpc.ReservationRequest,
      combined.grpc.ReservationResponse> getReserverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reserver",
      requestType = combined.grpc.ReservationRequest.class,
      responseType = combined.grpc.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.ReservationRequest,
      combined.grpc.ReservationResponse> getReserverMethod() {
    io.grpc.MethodDescriptor<combined.grpc.ReservationRequest, combined.grpc.ReservationResponse> getReserverMethod;
    if ((getReserverMethod = HotelServiceGrpc.getReserverMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getReserverMethod = HotelServiceGrpc.getReserverMethod) == null) {
          HotelServiceGrpc.getReserverMethod = getReserverMethod =
              io.grpc.MethodDescriptor.<combined.grpc.ReservationRequest, combined.grpc.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "reserver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("reserver"))
              .build();
        }
      }
    }
    return getReserverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<combined.grpc.HotelInfoRequest,
      combined.grpc.HotelInfoResponse> getRechercherHotelEtChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rechercherHotelEtChambre",
      requestType = combined.grpc.HotelInfoRequest.class,
      responseType = combined.grpc.HotelInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.HotelInfoRequest,
      combined.grpc.HotelInfoResponse> getRechercherHotelEtChambreMethod() {
    io.grpc.MethodDescriptor<combined.grpc.HotelInfoRequest, combined.grpc.HotelInfoResponse> getRechercherHotelEtChambreMethod;
    if ((getRechercherHotelEtChambreMethod = HotelServiceGrpc.getRechercherHotelEtChambreMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getRechercherHotelEtChambreMethod = HotelServiceGrpc.getRechercherHotelEtChambreMethod) == null) {
          HotelServiceGrpc.getRechercherHotelEtChambreMethod = getRechercherHotelEtChambreMethod =
              io.grpc.MethodDescriptor.<combined.grpc.HotelInfoRequest, combined.grpc.HotelInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "rechercherHotelEtChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("rechercherHotelEtChambre"))
              .build();
        }
      }
    }
    return getRechercherHotelEtChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<combined.grpc.PingRequest,
      combined.grpc.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ping",
      requestType = combined.grpc.PingRequest.class,
      responseType = combined.grpc.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.PingRequest,
      combined.grpc.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<combined.grpc.PingRequest, combined.grpc.PingResponse> getPingMethod;
    if ((getPingMethod = HotelServiceGrpc.getPingMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getPingMethod = HotelServiceGrpc.getPingMethod) == null) {
          HotelServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<combined.grpc.PingRequest, combined.grpc.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceStub>() {
        @java.lang.Override
        public HotelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceStub(channel, callOptions);
        }
      };
    return HotelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceBlockingStub>() {
        @java.lang.Override
        public HotelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceBlockingStub(channel, callOptions);
        }
      };
    return HotelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceFutureStub>() {
        @java.lang.Override
        public HotelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceFutureStub(channel, callOptions);
        }
      };
    return HotelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for Hotels
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void rechercherHotel(combined.grpc.HotelSearchRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.HotelSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRechercherHotelMethod(), responseObserver);
    }

    /**
     */
    default void rechercherHotelByInformations(combined.grpc.HotelInfoRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.HotelInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRechercherHotelByInformationsMethod(), responseObserver);
    }

    /**
     */
    default void reserver(combined.grpc.ReservationRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReserverMethod(), responseObserver);
    }

    /**
     */
    default void rechercherHotelEtChambre(combined.grpc.HotelInfoRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.HotelInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRechercherHotelEtChambreMethod(), responseObserver);
    }

    /**
     */
    default void ping(combined.grpc.PingRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.PingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HotelService.
   * <pre>
   * Service for Hotels
   * </pre>
   */
  public static abstract class HotelServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HotelServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HotelService.
   * <pre>
   * Service for Hotels
   * </pre>
   */
  public static final class HotelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HotelServiceStub> {
    private HotelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceStub(channel, callOptions);
    }

    /**
     */
    public void rechercherHotel(combined.grpc.HotelSearchRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.HotelSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRechercherHotelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rechercherHotelByInformations(combined.grpc.HotelInfoRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.HotelInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRechercherHotelByInformationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reserver(combined.grpc.ReservationRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReserverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rechercherHotelEtChambre(combined.grpc.HotelInfoRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.HotelInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRechercherHotelEtChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ping(combined.grpc.PingRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.PingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HotelService.
   * <pre>
   * Service for Hotels
   * </pre>
   */
  public static final class HotelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HotelServiceBlockingStub> {
    private HotelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public combined.grpc.HotelSearchResponse rechercherHotel(combined.grpc.HotelSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRechercherHotelMethod(), getCallOptions(), request);
    }

    /**
     */
    public combined.grpc.HotelInfoResponse rechercherHotelByInformations(combined.grpc.HotelInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRechercherHotelByInformationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public combined.grpc.ReservationResponse reserver(combined.grpc.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReserverMethod(), getCallOptions(), request);
    }

    /**
     */
    public combined.grpc.HotelInfoResponse rechercherHotelEtChambre(combined.grpc.HotelInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRechercherHotelEtChambreMethod(), getCallOptions(), request);
    }

    /**
     */
    public combined.grpc.PingResponse ping(combined.grpc.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HotelService.
   * <pre>
   * Service for Hotels
   * </pre>
   */
  public static final class HotelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HotelServiceFutureStub> {
    private HotelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.HotelSearchResponse> rechercherHotel(
        combined.grpc.HotelSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRechercherHotelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.HotelInfoResponse> rechercherHotelByInformations(
        combined.grpc.HotelInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRechercherHotelByInformationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.ReservationResponse> reserver(
        combined.grpc.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReserverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.HotelInfoResponse> rechercherHotelEtChambre(
        combined.grpc.HotelInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRechercherHotelEtChambreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.PingResponse> ping(
        combined.grpc.PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECHERCHER_HOTEL = 0;
  private static final int METHODID_RECHERCHER_HOTEL_BY_INFORMATIONS = 1;
  private static final int METHODID_RESERVER = 2;
  private static final int METHODID_RECHERCHER_HOTEL_ET_CHAMBRE = 3;
  private static final int METHODID_PING = 4;

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
        case METHODID_RECHERCHER_HOTEL:
          serviceImpl.rechercherHotel((combined.grpc.HotelSearchRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.HotelSearchResponse>) responseObserver);
          break;
        case METHODID_RECHERCHER_HOTEL_BY_INFORMATIONS:
          serviceImpl.rechercherHotelByInformations((combined.grpc.HotelInfoRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.HotelInfoResponse>) responseObserver);
          break;
        case METHODID_RESERVER:
          serviceImpl.reserver((combined.grpc.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.ReservationResponse>) responseObserver);
          break;
        case METHODID_RECHERCHER_HOTEL_ET_CHAMBRE:
          serviceImpl.rechercherHotelEtChambre((combined.grpc.HotelInfoRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.HotelInfoResponse>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((combined.grpc.PingRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.PingResponse>) responseObserver);
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
          getRechercherHotelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.HotelSearchRequest,
              combined.grpc.HotelSearchResponse>(
                service, METHODID_RECHERCHER_HOTEL)))
        .addMethod(
          getRechercherHotelByInformationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.HotelInfoRequest,
              combined.grpc.HotelInfoResponse>(
                service, METHODID_RECHERCHER_HOTEL_BY_INFORMATIONS)))
        .addMethod(
          getReserverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.ReservationRequest,
              combined.grpc.ReservationResponse>(
                service, METHODID_RESERVER)))
        .addMethod(
          getRechercherHotelEtChambreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.HotelInfoRequest,
              combined.grpc.HotelInfoResponse>(
                service, METHODID_RECHERCHER_HOTEL_ET_CHAMBRE)))
        .addMethod(
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.PingRequest,
              combined.grpc.PingResponse>(
                service, METHODID_PING)))
        .build();
  }

  private static abstract class HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return combined.grpc.Combined.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelService");
    }
  }

  private static final class HotelServiceFileDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier {
    HotelServiceFileDescriptorSupplier() {}
  }

  private static final class HotelServiceMethodDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HotelServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HotelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelServiceFileDescriptorSupplier())
              .addMethod(getRechercherHotelMethod())
              .addMethod(getRechercherHotelByInformationsMethod())
              .addMethod(getReserverMethod())
              .addMethod(getRechercherHotelEtChambreMethod())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
