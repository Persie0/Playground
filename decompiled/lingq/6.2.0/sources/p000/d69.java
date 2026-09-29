package p000;

import android.content.res.TypedArray;
import com.facebook.shimmer.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public final class d69 extends q80 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f35047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d69(int i) {
        super(1);
        this.f35047c = i;
        switch (i) {
            case 1:
                super(1);
                break;
            default:
                ((e69) this.f57375b).f36780p = true;
                break;
        }
    }

    @Override // p000.q80
    /* JADX INFO: renamed from: e */
    public q80 mo10129e(TypedArray typedArray) {
        switch (this.f35047c) {
            case 1:
                e69 e69Var = (e69) this.f57375b;
                super.mo10129e(typedArray);
                if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_base_color)) {
                    e69Var.f36769e = (typedArray.getColor(R$styleable.ShimmerFrameLayout_shimmer_base_color, e69Var.f36769e) & 16777215) | (e69Var.f36769e & (-16777216));
                }
                if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_highlight_color)) {
                    e69Var.f36768d = typedArray.getColor(R$styleable.ShimmerFrameLayout_shimmer_highlight_color, e69Var.f36768d);
                }
                return this;
            default:
                return super.mo10129e(typedArray);
        }
    }

    @Override // p000.q80
    /* JADX INFO: renamed from: f */
    public final q80 mo10130f() {
        int i = this.f35047c;
        return this;
    }
}
