package p000;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class lmb implements zna {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49842a;

    /* JADX INFO: renamed from: b */
    public boolean f49843b = false;

    /* JADX INFO: renamed from: c */
    public boolean f49844c = false;

    /* JADX INFO: renamed from: d */
    public c33 f49845d;

    /* JADX INFO: renamed from: e */
    public final gp6 f49846e;

    public /* synthetic */ lmb(gp6 gp6Var, int i) {
        this.f49842a = i;
        this.f49846e = gp6Var;
    }

    @Override // p000.zna
    /* JADX INFO: renamed from: b */
    public final zna mo16390b(String str) {
        int i = this.f49842a;
        gp6 gp6Var = this.f49846e;
        switch (i) {
            case 0:
                if (this.f49843b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f49843b = true;
                ((ylb) gp6Var).m25190c(this.f49845d, str, this.f49844c);
                return this;
            case 1:
                if (this.f49843b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f49843b = true;
                ((vmb) gp6Var).m23428b(this.f49845d, str, this.f49844c);
                return this;
            default:
                if (this.f49843b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f49843b = true;
                ((uvb) gp6Var).m22953c(this.f49845d, str, this.f49844c);
                return this;
        }
    }

    @Override // p000.zna
    /* JADX INFO: renamed from: c */
    public final zna mo16391c(boolean z) {
        int i = this.f49842a;
        gp6 gp6Var = this.f49846e;
        switch (i) {
            case 0:
                if (this.f49843b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f49843b = true;
                ((ylb) gp6Var).m25191h(this.f49845d, z ? 1 : 0, this.f49844c);
                return this;
            case 1:
                if (this.f49843b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f49843b = true;
                ((vmb) gp6Var).m23430h(this.f49845d, z ? 1 : 0, this.f49844c);
                return this;
            default:
                if (this.f49843b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f49843b = true;
                ((uvb) gp6Var).m22954h(this.f49845d, z ? 1 : 0, this.f49844c);
                return this;
        }
    }
}
