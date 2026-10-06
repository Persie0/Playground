package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class oml extends omf implements ooa {

    /* JADX INFO: renamed from: a */
    private final int f46316a;

    public oml(int i, ols olsVar) {
        super(olsVar);
        this.f46316a = i;
    }

    @Override // p000.ooa
    /* JADX INFO: renamed from: i */
    public final int mo18660i() {
        return this.f46316a;
    }

    @Override // p000.omd
    public final String toString() {
        if (this.f46310m != null) {
            return super.toString();
        }
        String strM18739e = ooc.m18739e(this);
        strM18739e.getClass();
        return strM18739e;
    }
}
