package combined.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: combined.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NavigoServiceGrpc {

  private NavigoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "combined.grpc.NavigoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<combined.grpc.HotelSearchRequest,
      combined.grpc.HotelSearchResponseList> getRechercherHotelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rechercherHotels",
      requestType = combined.grpc.HotelSearchRequest.class,
      responseType = combined.grpc.HotelSearchResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.HotelSearchRequest,
      combined.grpc.HotelSearchResponseList> getRechercherHotelsMethod() {
    io.grpc.MethodDescriptor<combined.grpc.HotelSearchRequest, combined.grpc.HotelSearchResponseList> getRechercherHotelsMethod;
    if ((getRechercherHotelsMethod = NavigoServiceGrpc.getRechercherHotelsMethod) == null) {
      synchronized (NavigoServiceGrpc.class) {
        if ((getRechercherHotelsMethod = NavigoServiceGrpc.getRechercherHotelsMethod) == null) {
          NavigoServiceGrpc.getRechercherHotelsMethod = getRechercherHotelsMethod =
              io.grpc.MethodDescriptor.<combined.grpc.HotelSearchRequest, combined.grpc.HotelSearchResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "rechercherHotels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelSearchResponseList.getDefaultInstance()))
              .setSchemaDescriptor(new NavigoServiceMethodDescriptorSupplier("rechercherHotels"))
              .build();
        }
      }
    }
    return getRechercherHotelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<combined.grpc.HotelInfoRequest,
      combined.grpc.HotelInfoResponse> getHotelByInformationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hotelByInformations",
      requestType = combined.grpc.HotelInfoRequest.class,
      responseType = combined.grpc.HotelInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.HotelInfoRequest,
      combined.grpc.HotelInfoResponse> getHotelByInformationsMethod() {
    io.grpc.MethodDescriptor<combined.grpc.HotelInfoRequest, combined.grpc.HotelInfoResponse> getHotelByInformationsMethod;
    if ((getHotelByInformationsMethod = NavigoServiceGrpc.getHotelByInformationsMethod) == null) {
      synchronized (NavigoServiceGrpc.class) {
        if ((getHotelByInformationsMethod = NavigoServiceGrpc.getHotelByInformationsMethod) == null) {
          NavigoServiceGrpc.getHotelByInformationsMethod = getHotelByInformationsMethod =
              io.grpc.MethodDescriptor.<combined.grpc.HotelInfoRequest, combined.grpc.HotelInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hotelByInformations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigoServiceMethodDescriptorSupplier("hotelByInformations"))
              .build();
        }
      }
    }
    return getHotelByInformationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<combined.grpc.SaveCardRequest,
      combined.grpc.SaveCardResponse> getSaveCardInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveCardInfo",
      requestType = combined.grpc.SaveCardRequest.class,
      responseType = combined.grpc.SaveCardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.SaveCardRequest,
      combined.grpc.SaveCardResponse> getSaveCardInfoMethod() {
    io.grpc.MethodDescriptor<combined.grpc.SaveCardRequest, combined.grpc.SaveCardResponse> getSaveCardInfoMethod;
    if ((getSaveCardInfoMethod = NavigoServiceGrpc.getSaveCardInfoMethod) == null) {
      synchronized (NavigoServiceGrpc.class) {
        if ((getSaveCardInfoMethod = NavigoServiceGrpc.getSaveCardInfoMethod) == null) {
          NavigoServiceGrpc.getSaveCardInfoMethod = getSaveCardInfoMethod =
              io.grpc.MethodDescriptor.<combined.grpc.SaveCardRequest, combined.grpc.SaveCardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveCardInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.SaveCardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.SaveCardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigoServiceMethodDescriptorSupplier("SaveCardInfo"))
              .build();
        }
      }
    }
    return getSaveCardInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<combined.grpc.ClientFilterRequest,
      combined.grpc.ClientCardResponse> getGetCardInfoByClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCardInfoByClient",
      requestType = combined.grpc.ClientFilterRequest.class,
      responseType = combined.grpc.ClientCardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.ClientFilterRequest,
      combined.grpc.ClientCardResponse> getGetCardInfoByClientMethod() {
    io.grpc.MethodDescriptor<combined.grpc.ClientFilterRequest, combined.grpc.ClientCardResponse> getGetCardInfoByClientMethod;
    if ((getGetCardInfoByClientMethod = NavigoServiceGrpc.getGetCardInfoByClientMethod) == null) {
      synchronized (NavigoServiceGrpc.class) {
        if ((getGetCardInfoByClientMethod = NavigoServiceGrpc.getGetCardInfoByClientMethod) == null) {
          NavigoServiceGrpc.getGetCardInfoByClientMethod = getGetCardInfoByClientMethod =
              io.grpc.MethodDescriptor.<combined.grpc.ClientFilterRequest, combined.grpc.ClientCardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCardInfoByClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.ClientFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.ClientCardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigoServiceMethodDescriptorSupplier("GetCardInfoByClient"))
              .build();
        }
      }
    }
    return getGetCardInfoByClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<combined.grpc.ReservationRequest,
      combined.grpc.ReservationResponse> getAjouterReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ajouterReservation",
      requestType = combined.grpc.ReservationRequest.class,
      responseType = combined.grpc.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.ReservationRequest,
      combined.grpc.ReservationResponse> getAjouterReservationMethod() {
    io.grpc.MethodDescriptor<combined.grpc.ReservationRequest, combined.grpc.ReservationResponse> getAjouterReservationMethod;
    if ((getAjouterReservationMethod = NavigoServiceGrpc.getAjouterReservationMethod) == null) {
      synchronized (NavigoServiceGrpc.class) {
        if ((getAjouterReservationMethod = NavigoServiceGrpc.getAjouterReservationMethod) == null) {
          NavigoServiceGrpc.getAjouterReservationMethod = getAjouterReservationMethod =
              io.grpc.MethodDescriptor.<combined.grpc.ReservationRequest, combined.grpc.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ajouterReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigoServiceMethodDescriptorSupplier("ajouterReservation"))
              .build();
        }
      }
    }
    return getAjouterReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<combined.grpc.CreateUserRequest,
      combined.grpc.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUser",
      requestType = combined.grpc.CreateUserRequest.class,
      responseType = combined.grpc.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.CreateUserRequest,
      combined.grpc.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<combined.grpc.CreateUserRequest, combined.grpc.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = NavigoServiceGrpc.getCreateUserMethod) == null) {
      synchronized (NavigoServiceGrpc.class) {
        if ((getCreateUserMethod = NavigoServiceGrpc.getCreateUserMethod) == null) {
          NavigoServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<combined.grpc.CreateUserRequest, combined.grpc.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigoServiceMethodDescriptorSupplier("createUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<combined.grpc.AuthRequest,
      combined.grpc.AuthResponse> getAuthenticateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "authenticateUser",
      requestType = combined.grpc.AuthRequest.class,
      responseType = combined.grpc.AuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<combined.grpc.AuthRequest,
      combined.grpc.AuthResponse> getAuthenticateUserMethod() {
    io.grpc.MethodDescriptor<combined.grpc.AuthRequest, combined.grpc.AuthResponse> getAuthenticateUserMethod;
    if ((getAuthenticateUserMethod = NavigoServiceGrpc.getAuthenticateUserMethod) == null) {
      synchronized (NavigoServiceGrpc.class) {
        if ((getAuthenticateUserMethod = NavigoServiceGrpc.getAuthenticateUserMethod) == null) {
          NavigoServiceGrpc.getAuthenticateUserMethod = getAuthenticateUserMethod =
              io.grpc.MethodDescriptor.<combined.grpc.AuthRequest, combined.grpc.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "authenticateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.AuthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.AuthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NavigoServiceMethodDescriptorSupplier("authenticateUser"))
              .build();
        }
      }
    }
    return getAuthenticateUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NavigoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavigoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavigoServiceStub>() {
        @java.lang.Override
        public NavigoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavigoServiceStub(channel, callOptions);
        }
      };
    return NavigoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NavigoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavigoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavigoServiceBlockingStub>() {
        @java.lang.Override
        public NavigoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavigoServiceBlockingStub(channel, callOptions);
        }
      };
    return NavigoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NavigoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NavigoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NavigoServiceFutureStub>() {
        @java.lang.Override
        public NavigoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NavigoServiceFutureStub(channel, callOptions);
        }
      };
    return NavigoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void rechercherHotels(combined.grpc.HotelSearchRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.HotelSearchResponseList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRechercherHotelsMethod(), responseObserver);
    }

    /**
     */
    default void hotelByInformations(combined.grpc.HotelInfoRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.HotelInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHotelByInformationsMethod(), responseObserver);
    }

    /**
     */
    default void saveCardInfo(combined.grpc.SaveCardRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.SaveCardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveCardInfoMethod(), responseObserver);
    }

    /**
     */
    default void getCardInfoByClient(combined.grpc.ClientFilterRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.ClientCardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCardInfoByClientMethod(), responseObserver);
    }

    /**
     */
    default void ajouterReservation(combined.grpc.ReservationRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAjouterReservationMethod(), responseObserver);
    }

    /**
     */
    default void createUser(combined.grpc.CreateUserRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.CreateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    default void authenticateUser(combined.grpc.AuthRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.AuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthenticateUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NavigoService.
   */
  public static abstract class NavigoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NavigoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NavigoService.
   */
  public static final class NavigoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NavigoServiceStub> {
    private NavigoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavigoServiceStub(channel, callOptions);
    }

    /**
     */
    public void rechercherHotels(combined.grpc.HotelSearchRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.HotelSearchResponseList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRechercherHotelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hotelByInformations(combined.grpc.HotelInfoRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.HotelInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHotelByInformationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCardInfo(combined.grpc.SaveCardRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.SaveCardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveCardInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCardInfoByClient(combined.grpc.ClientFilterRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.ClientCardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCardInfoByClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ajouterReservation(combined.grpc.ReservationRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAjouterReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUser(combined.grpc.CreateUserRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.CreateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authenticateUser(combined.grpc.AuthRequest request,
        io.grpc.stub.StreamObserver<combined.grpc.AuthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthenticateUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NavigoService.
   */
  public static final class NavigoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NavigoServiceBlockingStub> {
    private NavigoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavigoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public combined.grpc.HotelSearchResponseList rechercherHotels(combined.grpc.HotelSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRechercherHotelsMethod(), getCallOptions(), request);
    }

    /**
     */
    public combined.grpc.HotelInfoResponse hotelByInformations(combined.grpc.HotelInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHotelByInformationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public combined.grpc.SaveCardResponse saveCardInfo(combined.grpc.SaveCardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveCardInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public combined.grpc.ClientCardResponse getCardInfoByClient(combined.grpc.ClientFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCardInfoByClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public combined.grpc.ReservationResponse ajouterReservation(combined.grpc.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAjouterReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public combined.grpc.CreateUserResponse createUser(combined.grpc.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public combined.grpc.AuthResponse authenticateUser(combined.grpc.AuthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthenticateUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NavigoService.
   */
  public static final class NavigoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NavigoServiceFutureStub> {
    private NavigoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NavigoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NavigoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.HotelSearchResponseList> rechercherHotels(
        combined.grpc.HotelSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRechercherHotelsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.HotelInfoResponse> hotelByInformations(
        combined.grpc.HotelInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHotelByInformationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.SaveCardResponse> saveCardInfo(
        combined.grpc.SaveCardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveCardInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.ClientCardResponse> getCardInfoByClient(
        combined.grpc.ClientFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCardInfoByClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.ReservationResponse> ajouterReservation(
        combined.grpc.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAjouterReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.CreateUserResponse> createUser(
        combined.grpc.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<combined.grpc.AuthResponse> authenticateUser(
        combined.grpc.AuthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthenticateUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECHERCHER_HOTELS = 0;
  private static final int METHODID_HOTEL_BY_INFORMATIONS = 1;
  private static final int METHODID_SAVE_CARD_INFO = 2;
  private static final int METHODID_GET_CARD_INFO_BY_CLIENT = 3;
  private static final int METHODID_AJOUTER_RESERVATION = 4;
  private static final int METHODID_CREATE_USER = 5;
  private static final int METHODID_AUTHENTICATE_USER = 6;

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
        case METHODID_RECHERCHER_HOTELS:
          serviceImpl.rechercherHotels((combined.grpc.HotelSearchRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.HotelSearchResponseList>) responseObserver);
          break;
        case METHODID_HOTEL_BY_INFORMATIONS:
          serviceImpl.hotelByInformations((combined.grpc.HotelInfoRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.HotelInfoResponse>) responseObserver);
          break;
        case METHODID_SAVE_CARD_INFO:
          serviceImpl.saveCardInfo((combined.grpc.SaveCardRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.SaveCardResponse>) responseObserver);
          break;
        case METHODID_GET_CARD_INFO_BY_CLIENT:
          serviceImpl.getCardInfoByClient((combined.grpc.ClientFilterRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.ClientCardResponse>) responseObserver);
          break;
        case METHODID_AJOUTER_RESERVATION:
          serviceImpl.ajouterReservation((combined.grpc.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.ReservationResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((combined.grpc.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.CreateUserResponse>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_USER:
          serviceImpl.authenticateUser((combined.grpc.AuthRequest) request,
              (io.grpc.stub.StreamObserver<combined.grpc.AuthResponse>) responseObserver);
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
          getRechercherHotelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.HotelSearchRequest,
              combined.grpc.HotelSearchResponseList>(
                service, METHODID_RECHERCHER_HOTELS)))
        .addMethod(
          getHotelByInformationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.HotelInfoRequest,
              combined.grpc.HotelInfoResponse>(
                service, METHODID_HOTEL_BY_INFORMATIONS)))
        .addMethod(
          getSaveCardInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.SaveCardRequest,
              combined.grpc.SaveCardResponse>(
                service, METHODID_SAVE_CARD_INFO)))
        .addMethod(
          getGetCardInfoByClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.ClientFilterRequest,
              combined.grpc.ClientCardResponse>(
                service, METHODID_GET_CARD_INFO_BY_CLIENT)))
        .addMethod(
          getAjouterReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.ReservationRequest,
              combined.grpc.ReservationResponse>(
                service, METHODID_AJOUTER_RESERVATION)))
        .addMethod(
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.CreateUserRequest,
              combined.grpc.CreateUserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getAuthenticateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              combined.grpc.AuthRequest,
              combined.grpc.AuthResponse>(
                service, METHODID_AUTHENTICATE_USER)))
        .build();
  }

  private static abstract class NavigoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NavigoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return combined.grpc.Combined.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NavigoService");
    }
  }

  private static final class NavigoServiceFileDescriptorSupplier
      extends NavigoServiceBaseDescriptorSupplier {
    NavigoServiceFileDescriptorSupplier() {}
  }

  private static final class NavigoServiceMethodDescriptorSupplier
      extends NavigoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NavigoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (NavigoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NavigoServiceFileDescriptorSupplier())
              .addMethod(getRechercherHotelsMethod())
              .addMethod(getHotelByInformationsMethod())
              .addMethod(getSaveCardInfoMethod())
              .addMethod(getGetCardInfoByClientMethod())
              .addMethod(getAjouterReservationMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getAuthenticateUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
