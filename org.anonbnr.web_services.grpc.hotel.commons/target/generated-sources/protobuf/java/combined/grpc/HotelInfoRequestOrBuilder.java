// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: combined.proto

package combined.grpc;

public interface HotelInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:combined.grpc.HotelInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the hotel
   * </pre>
   *
   * <code>string nomHotel = 1;</code>
   * @return The nomHotel.
   */
  java.lang.String getNomHotel();
  /**
   * <pre>
   * Name of the hotel
   * </pre>
   *
   * <code>string nomHotel = 1;</code>
   * @return The bytes for nomHotel.
   */
  com.google.protobuf.ByteString
      getNomHotelBytes();

  /**
   * <pre>
   * Room number in the hotel
   * </pre>
   *
   * <code>int32 numeroChambre = 2;</code>
   * @return The numeroChambre.
   */
  int getNumeroChambre();

  /**
   * <pre>
   * Start date of the reservation in YYYY-MM-DD format
   * </pre>
   *
   * <code>string dateDebut = 3;</code>
   * @return The dateDebut.
   */
  java.lang.String getDateDebut();
  /**
   * <pre>
   * Start date of the reservation in YYYY-MM-DD format
   * </pre>
   *
   * <code>string dateDebut = 3;</code>
   * @return The bytes for dateDebut.
   */
  com.google.protobuf.ByteString
      getDateDebutBytes();

  /**
   * <pre>
   * End date of the reservation in YYYY-MM-DD format
   * </pre>
   *
   * <code>string dateFin = 4;</code>
   * @return The dateFin.
   */
  java.lang.String getDateFin();
  /**
   * <pre>
   * End date of the reservation in YYYY-MM-DD format
   * </pre>
   *
   * <code>string dateFin = 4;</code>
   * @return The bytes for dateFin.
   */
  com.google.protobuf.ByteString
      getDateFinBytes();
}
