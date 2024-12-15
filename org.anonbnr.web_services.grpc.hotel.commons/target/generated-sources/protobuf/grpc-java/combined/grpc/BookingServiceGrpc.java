package combined.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for Booking
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: combined.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookingServiceGrpc {

  private BookingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "combined.grpc.BookingService";

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
    if ((getRechercherHotelsMethod = BookingServiceGrpc.getRechercherHotelsMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getRechercherHotelsMethod = BookingServiceGrpc.getRechercherHotelsMethod) == null) {
          BookingServiceGrpc.getRechercherHotelsMethod = getRechercherHotelsMethod =
              io.grpc.MethodDescriptor.<combined.grpc.HotelSearchRequest, combined.grpc.HotelSearchResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "rechercherHotels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelSearchResponseList.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("rechercherHotels"))
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
    if ((getHotelByInformationsMethod = BookingServiceGrpc.getHotelByInformationsMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getHotelByInformationsMethod = BookingServiceGrpc.getHotelByInformationsMethod) == null) {
          BookingServiceGrpc.getHotelByInformationsMethod = getHotelByInformationsMethod =
              io.grpc.MethodDescriptor.<combined.grpc.HotelInfoRequest, combined.grpc.HotelInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hotelByInformations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.HotelInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("hotelByInformations"))
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
    if ((getSaveCardInfoMethod = BookingServiceGrpc.getSaveCardInfoMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getSaveCardInfoMethod = BookingServiceGrpc.getSaveCardInfoMethod) == null) {
          BookingServiceGrpc.getSaveCardInfoMethod = getSaveCardInfoMethod =
              io.grpc.MethodDescriptor.<combined.grpc.SaveCardRequest, combined.grpc.SaveCardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveCardInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.SaveCardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.SaveCardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("SaveCardInfo"))
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
    if ((getGetCardInfoByClientMethod = BookingServiceGrpc.getGetCardInfoByClientMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetCardInfoByClientMethod = BookingServiceGrpc.getGetCardInfoByClientMethod) == null) {
          BookingServiceGrpc.getGetCardInfoByClientMethod = getGetCardInfoByClientMethod =
              io.grpc.MethodDescriptor.<combined.grpc.ClientFilterRequest, combined.grpc.ClientCardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCardInfoByClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.ClientFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.ClientCardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("GetCardInfoByClient"))
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
    if ((getAjouterReservationMethod = BookingServiceGrpc.getAjouterReservationMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getAjouterReservationMethod = BookingServiceGrpc.getAjouterReservationMethod) == null) {
          BookingServiceGrpc.getAjouterReservationMethod = getAjouterReservationMethod =
              io.grpc.MethodDescriptor.<combined.grpc.ReservationRequest, combined.grpc.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ajouterReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("ajouterReservation"))
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
    if ((getCreateUserMethod = BookingServiceGrpc.getCreateUserMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getCreateUserMethod = BookingServiceGrpc.getCreateUserMethod) == null) {
          BookingServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<combined.grpc.CreateUserRequest, combined.grpc.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("createUser"))
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
    if ((getAuthenticateUserMethod = BookingServiceGrpc.getAuthenticateUserMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getAuthenticateUserMethod = BookingServiceGrpc.getAuthenticateUserMethod) == null) {
          BookingServiceGrpc.getAuthenticateUserMethod = getAuthenticateUserMethod =
              io.grpc.MethodDescriptor.<combined.grpc.AuthRequest, combined.grpc.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "authenticateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.AuthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  combined.grpc.AuthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("authenticateUser"))
              .build();
        }
      }
    }
    return getAuthenticateUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub>() {
        @java.lang.Override
        public BookingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceStub(channel, callOptions);
        }
      };
    return BookingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub>() {
        @java.lang.Override
        public BookingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceBlockingStub(channel, callOptions);
        }
      };
    return BookingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub>() {
        @java.lang.Override
        public BookingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceFutureStub(channel, callOptions);
        }
      };
    return BookingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for Booking
   * </pre>
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
   * Base class for the server implementation of the service BookingService.
   * <pre>
   * Service for Booking
   * </pre>
   */
  public static abstract class BookingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookingService.
   * <pre>
   * Service for Booking
   * </pre>
   */
  public static final class BookingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookingServiceStub> {
    private BookingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceStub(channel, callOptions);
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
   * A stub to allow clients to do synchronous rpc calls to service BookingService.
   * <pre>
   * Service for Booking
   * </pre>
   */
  public static final class BookingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookingServiceBlockingStub> {
    private BookingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceBlockingStub(channel, callOptions);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookingService.
   * <pre>
   * Service for Booking
   * </pre>
   */
  public static final class BookingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookingServiceFutureStub> {
    private BookingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceFutureStub(channel, callOptions);
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

  private static abstract class BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return combined.grpc.Combined.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookingService");
    }
  }

  private static final class BookingServiceFileDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier {
    BookingServiceFileDescriptorSupplier() {}
  }

  private static final class BookingServiceMethodDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BookingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingServiceFileDescriptorSupplier())
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
