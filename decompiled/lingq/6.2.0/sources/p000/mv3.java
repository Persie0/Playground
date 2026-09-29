package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class mv3 implements o39 {

    /* JADX INFO: renamed from: b */
    public static final mv3 f51880b = new mv3(0);

    /* JADX INFO: renamed from: c */
    public static final mv3 f51881c = new mv3(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51882a;

    public /* synthetic */ mv3(int i) {
        this.f51882a = i;
    }

    @Override // p000.o39
    /* JADX INFO: renamed from: b */
    public final pk9 mo12726b(long j, LayoutDirection layoutDirection, fb2 fb2Var) {
        switch (this.f51882a) {
            case 0:
                float fMo916w0 = fb2Var.mo916w0(30.0f);
                return new b07(new e28(0.0f, -fMo916w0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fMo916w0));
            case 1:
                float fMo916w1 = fb2Var.mo916w0(30.0f);
                return new b07(new e28(-fMo916w1, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fMo916w1, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new b07(wfb.m23907b(0L, j));
        }
    }

    public String toString() {
        switch (this.f51882a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
