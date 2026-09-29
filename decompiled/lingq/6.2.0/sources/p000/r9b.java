package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class r9b extends tk3 implements sx5 {
    public r9b() {
        super(s9b.DEFAULT_INSTANCE);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m22173c();
    }

    /* JADX INFO: renamed from: f */
    public final void m20477f(ByteString byteString) {
        m22174d();
        s9b.m21179x((s9b) this.f62440b, byteString);
    }

    /* JADX INFO: renamed from: g */
    public final void m20478g() {
        m22174d();
        s9b.m21178w((s9b) this.f62440b);
    }

    @Override // p000.sx5
    public final AbstractC1134i getDefaultInstanceForType() {
        return this.f62439a;
    }
}
