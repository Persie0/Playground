package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import ao.C1271c;
import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import java.io.InputStream;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReference implements InterfaceC2052l<String, InputStream> {
    public BuiltInsLoaderImpl$createPackageFragmentProvider$1(C1271c c1271c) {
        super(1, c1271c);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "loadResource";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.m11118a(C1271c.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final InputStream mo528n(String str) {
        String str2 = str;
        C5207g.m11111f(str2, "p0");
        ((C1271c) this.f38112b).getClass();
        return C1271c.m4771a(str2);
    }
}
