// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TextConverter.proto

package via.sdj3.grpcspringbootx.protobuf;

public final class TextConverterOuterClass {
  private TextConverterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestText_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestText_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseText_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseText_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023TextConverter.proto\"!\n\013RequestText\022\022\n\n" +
      "input_text\030\001 \001(\005\"#\n\014ResponseText\022\023\n\013outp" +
      "ut_text\030\001 \001(\t2z\n\rTextConverter\0224\n\025getAni" +
      "malsByProductId\022\014.RequestText\032\r.Response" +
      "Text\0223\n\024getProductByAnimalId\022\014.RequestTe" +
      "xt\032\r.ResponseTextB%\n!via.sdj3.grpcspring" +
      "bootx.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RequestText_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RequestText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestText_descriptor,
        new java.lang.String[] { "InputText", });
    internal_static_ResponseText_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ResponseText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseText_descriptor,
        new java.lang.String[] { "OutputText", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
