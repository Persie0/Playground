package kotlin.reflect.jvm;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6721d;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReference implements InterfaceC2056p<MemberDeserializer, ProtoBuf$Function, InterfaceC6824e> {

    /* JADX INFO: renamed from: j */
    public static final ReflectLambdaKt$reflect$descriptor$1 f38132j = new ReflectLambdaKt$reflect$descriptor$1();

    public ReflectLambdaKt$reflect$descriptor$1() {
        super(2);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.m11118a(MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC6824e mo1337m0(MemberDeserializer memberDeserializer, ProtoBuf$Function protoBuf$Function) {
        MemberDeserializer memberDeserializer2 = memberDeserializer;
        ProtoBuf$Function protoBuf$Function2 = protoBuf$Function;
        C5207g.m11111f(memberDeserializer2, "p0");
        C5207g.m11111f(protoBuf$Function2, "p1");
        return memberDeserializer2.m14128e(protoBuf$Function2);
    }
}
