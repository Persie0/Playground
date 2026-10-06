package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gwt {

    /* JADX INFO: renamed from: a */
    public final float f26632a;

    /* JADX INFO: renamed from: b */
    public final float f26633b;

    /* JADX INFO: renamed from: c */
    public final float f26634c;

    public gwt(float f, float f2, float f3) {
        this.f26632a = f;
        this.f26633b = f2;
        this.f26634c = f3;
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16825d("azimuth", this.f26632a);
        mrlVarM16765d.m16825d("pitch", this.f26633b);
        mrlVarM16765d.m16825d("roll", this.f26634c);
        return mrlVarM16765d.toString();
    }
}
