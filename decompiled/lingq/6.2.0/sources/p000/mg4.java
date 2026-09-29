package p000;

import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.C3263c;

/* JADX INFO: loaded from: classes3.dex */
public final class mg4 extends kg4 {

    /* JADX INFO: renamed from: H */
    public int f51282H;

    /* JADX INFO: renamed from: j */
    public final C3263c f51283j;

    /* JADX INFO: renamed from: k */
    public final List f51284k;

    /* JADX INFO: renamed from: l */
    public final int f51285l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg4(df4 df4Var, C3263c c3263c) {
        super(df4Var, c3263c, (String) null, 12);
        df4Var.getClass();
        this.f51283j = c3263c;
        List listM22622n1 = u91.m22622n1(c3263c.f48242a.keySet());
        this.f51284k = listM22622n1;
        this.f51285l = listM22622n1.size() * 2;
        this.f51282H = -1;
    }

    @Override // p000.kg4, p000.df1
    /* JADX INFO: renamed from: A */
    public final int mo10319A(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.f51282H;
        if (i >= this.f51285l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f51282H = i2;
        return i2;
    }

    @Override // p000.kg4, p000.AbstractC3668v0
    /* JADX INFO: renamed from: R */
    public final String mo15175R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return (String) this.f51284k.get(i / 2);
    }

    @Override // p000.kg4, p000.AbstractC3668v0
    /* JADX INFO: renamed from: T */
    public final AbstractC3262b mo13893T() {
        return this.f51283j;
    }

    @Override // p000.kg4
    /* JADX INFO: renamed from: Y */
    public final C3263c mo13893T() {
        return this.f51283j;
    }

    @Override // p000.kg4, p000.AbstractC3668v0
    /* JADX INFO: renamed from: c */
    public final AbstractC3262b mo13894c(String str) {
        str.getClass();
        return this.f51282H % 2 == 0 ? sf4.m21335b(str) : (AbstractC3262b) AbstractC3194a.m15361N(str, this.f51283j);
    }

    @Override // p000.kg4, p000.AbstractC3668v0, p000.df1
    /* JADX INFO: renamed from: j */
    public final void mo4086j(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }
}
