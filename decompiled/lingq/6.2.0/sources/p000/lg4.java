package p000;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.C3261a;

/* JADX INFO: loaded from: classes3.dex */
public final class lg4 extends AbstractC3668v0 {

    /* JADX INFO: renamed from: f */
    public final C3261a f49628f;

    /* JADX INFO: renamed from: g */
    public final int f49629g;

    /* JADX INFO: renamed from: h */
    public int f49630h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg4(df4 df4Var, C3261a c3261a) {
        super(df4Var, null);
        df4Var.getClass();
        this.f49628f = c3261a;
        this.f49629g = c3261a.f48241a.size();
        this.f49630h = -1;
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: A */
    public final int mo10319A(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.f49630h;
        if (i >= this.f49629g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f49630h = i2;
        return i2;
    }

    @Override // p000.AbstractC3668v0
    /* JADX INFO: renamed from: R */
    public final String mo15175R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return String.valueOf(i);
    }

    @Override // p000.AbstractC3668v0
    /* JADX INFO: renamed from: T */
    public final AbstractC3262b mo13893T() {
        return this.f49628f;
    }

    @Override // p000.AbstractC3668v0
    /* JADX INFO: renamed from: c */
    public final AbstractC3262b mo13894c(String str) {
        str.getClass();
        return this.f49628f.get(Integer.parseInt(str));
    }
}
