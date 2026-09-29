package p000;

import com.google.common.base.AbstractC1082b;

/* JADX INFO: loaded from: classes2.dex */
public final class uf9 extends AbstractC1082b {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f63852h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xf9 f63853i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uf9(xf9 xf9Var, kg0 kg0Var, CharSequence charSequence, int i) {
        super(kg0Var, charSequence);
        this.f63852h = i;
        this.f63853i = xf9Var;
    }

    @Override // com.google.common.base.AbstractC1082b
    /* JADX INFO: renamed from: a */
    public final int mo6267a(int i) {
        switch (this.f63852h) {
            case 0:
                return i + 1;
            default:
                return ((C2920da) this.f63853i).f35235b.length() + i;
        }
    }

    @Override // com.google.common.base.AbstractC1082b
    /* JADX INFO: renamed from: b */
    public final int mo6268b(int i) {
        int i2 = this.f63852h;
        CharSequence charSequence = this.f13376c;
        xf9 xf9Var = this.f63853i;
        switch (i2) {
            case 0:
                su0 su0Var = (su0) ((vf9) xf9Var).f65323a;
                int length = charSequence.length();
                bna.m3981w(i, length);
                while (i < length) {
                    if (su0Var.mo20819a(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                String str = ((C2920da) xf9Var).f35235b;
                int length2 = str.length();
                int length3 = charSequence.length() - length2;
                while (i <= length3) {
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (charSequence.charAt(i3 + i) != str.charAt(i3)) {
                            i++;
                        }
                    }
                    return i;
                }
                return -1;
        }
    }
}
