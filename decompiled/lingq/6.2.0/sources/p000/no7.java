package p000;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class no7 implements zna {

    /* JADX INFO: renamed from: a */
    public boolean f53061a = false;

    /* JADX INFO: renamed from: b */
    public boolean f53062b = false;

    /* JADX INFO: renamed from: c */
    public c33 f53063c;

    /* JADX INFO: renamed from: d */
    public final mo7 f53064d;

    public no7(mo7 mo7Var) {
        this.f53064d = mo7Var;
    }

    @Override // p000.zna
    /* JADX INFO: renamed from: b */
    public final zna mo16390b(String str) {
        if (this.f53061a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f53061a = true;
        this.f53064d.m16953i(this.f53063c, str, this.f53062b);
        return this;
    }

    @Override // p000.zna
    /* JADX INFO: renamed from: c */
    public final zna mo16391c(boolean z) {
        if (this.f53061a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f53061a = true;
        this.f53064d.m16951c(this.f53063c, z ? 1 : 0, this.f53062b);
        return this;
    }
}
