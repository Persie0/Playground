package p000;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC3262b;

/* JADX INFO: loaded from: classes3.dex */
public final class ig4 extends AbstractC3668v0 {

    /* JADX INFO: renamed from: f */
    public final AbstractC3262b f44070f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig4(df4 df4Var, AbstractC3262b abstractC3262b, String str) {
        super(df4Var, str);
        df4Var.getClass();
        abstractC3262b.getClass();
        this.f44070f = abstractC3262b;
        this.f64636a.add("primitive");
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: A */
    public final int mo10319A(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return 0;
    }

    @Override // p000.AbstractC3668v0
    /* JADX INFO: renamed from: T */
    public final AbstractC3262b mo13893T() {
        return this.f44070f;
    }

    @Override // p000.AbstractC3668v0
    /* JADX INFO: renamed from: c */
    public final AbstractC3262b mo13894c(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f44070f;
        }
        C3386nv.m17626m("This input can only handle primitives with 'primitive' tag");
        return null;
    }
}
