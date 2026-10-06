package p000;

import android.opengl.GLES20;
import java.nio.ShortBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exs extends ewx {

    /* JADX INFO: renamed from: i */
    public ShortBuffer f20871i;

    /* JADX INFO: renamed from: f */
    public int f20868f = 0;

    /* JADX INFO: renamed from: g */
    public int f20869g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f20870h = false;

    /* JADX INFO: renamed from: j */
    public ewz f20872j = null;

    /* JADX INFO: renamed from: k */
    public final ArrayList f20873k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public boolean f20874l = true;

    /* JADX INFO: renamed from: m */
    public boolean f20875m = true;

    /* JADX INFO: renamed from: b */
    public final void m8024b() {
        ArrayList arrayList = this.f20873k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            luc lucVar = (luc) arrayList.get(i);
            if (lucVar != null) {
                lucVar.m15987e();
            }
        }
        this.f20873k.clear();
    }

    @Override // p000.ewx
    /* JADX INFO: renamed from: c */
    public final void mo7961c(float[] fArr) throws ewy {
        ewz ewzVar;
        if (this.f20870h) {
            if (this.f20875m) {
                this.f20701e.m7968c();
                this.f20701e.m7972g(this.f20697a);
                this.f20701e.m7970e(this.f20698b);
                this.f20701e.m7971f(fArr);
                if (!this.f20700d.isEmpty()) {
                    ((luc) this.f20700d.get(0)).m15988f();
                }
                this.f20699c.position(0);
                GLES20.glDrawElements(4, this.f20868f, 5123, this.f20699c);
            }
            if (!this.f20874l || (ewzVar = this.f20872j) == null) {
                return;
            }
            ewzVar.m7968c();
            this.f20872j.m7972g(this.f20697a);
            this.f20872j.m7971f(fArr);
            this.f20871i.position(0);
            GLES20.glLineWidth(9.0f);
            GLES20.glDrawElements(2, this.f20869g, 5123, this.f20871i);
            GLES20.glDrawElements(0, this.f20869g, 5123, this.f20871i);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8025e(int i) {
        if (this.f20700d.isEmpty()) {
            return;
        }
        ((luc) this.f20700d.get(0)).f39211a = i;
    }
}
