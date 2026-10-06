package p000;

import com.google.android.material.behavior.iWN.zuAgeeF;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fzd {

    /* JADX INFO: renamed from: a */
    public final fzf f23959a;

    /* JADX INFO: renamed from: b */
    public final List f23960b;

    /* JADX INFO: renamed from: c */
    public final List f23961c;

    public fzd(fzf fzfVar, List list, List list2) {
        this.f23959a = fzfVar;
        this.f23960b = list;
        this.f23961c = list2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fzd)) {
            return false;
        }
        fzd fzdVar = (fzd) obj;
        return this.f23959a.equals(fzdVar.f23959a) && this.f23960b.equals(fzdVar.f23960b) && this.f23961c.equals(fzdVar.f23961c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23959a, this.f23960b, this.f23961c});
    }

    public final String toString() {
        mrl mrlVarM16766e = mpw.m16766e("ImageSaverTrace");
        mrlVarM16766e.m16823b("ProcessingMethod", this.f23959a);
        mrlVarM16766e.m16823b(zuAgeeF.bflyaiYHm, this.f23960b);
        mrlVarM16766e.m16823b("Reprocessing Metadata", this.f23961c);
        return mrlVarM16766e.toString();
    }
}
