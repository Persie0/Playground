package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6721d;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p372rm.InterfaceC8829b0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
public /* synthetic */ class KClassImpl$getLocalProperty$2$1$1 extends FunctionReference implements InterfaceC2056p<MemberDeserializer, ProtoBuf$Property, InterfaceC8829b0> {

    /* JADX INFO: renamed from: j */
    public static final KClassImpl$getLocalProperty$2$1$1 f38195j = new KClassImpl$getLocalProperty$2$1$1();

    public KClassImpl$getLocalProperty$2$1$1() {
        super(2);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "loadProperty";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.m11118a(MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC8829b0 mo1337m0(MemberDeserializer memberDeserializer, ProtoBuf$Property protoBuf$Property) {
        MemberDeserializer memberDeserializer2 = memberDeserializer;
        ProtoBuf$Property protoBuf$Property2 = protoBuf$Property;
        C5207g.m11111f(memberDeserializer2, "p0");
        C5207g.m11111f(protoBuf$Property2, "p1");
        return memberDeserializer2.m14129f(protoBuf$Property2);
    }
}
