package p000;

import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.WindowManager;
import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ewt {

    /* JADX INFO: renamed from: a */
    public final Handler f20687a;

    /* JADX INFO: renamed from: b */
    public final bnq f20688b;

    /* JADX INFO: renamed from: c */
    public boolean f20689c;

    /* JADX INFO: renamed from: e */
    public AmbientMode.AmbientController f20691e;

    /* JADX INFO: renamed from: f */
    private bon f20692f;

    /* JADX INFO: renamed from: g */
    private final SurfaceTexture f20693g = new SurfaceTexture(100);

    /* JADX INFO: renamed from: d */
    public boolean f20690d = false;

    public ewt(bnq bnqVar, Handler handler) {
        this.f20688b = bnqVar;
        this.f20687a = handler;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized bon m7956a(WindowManager windowManager, dhv dhvVar, AmbientMode.AmbientController ambientController, boolean z) {
        bnx bnxVar;
        int[] iArr;
        this.f20691e = ambientController;
        this.f20689c = true;
        bnq bnqVar = this.f20688b;
        if (bnqVar != null && bnqVar.mo2722g().m2800a() != 1) {
            bob bobVarMo2720e = this.f20688b.mo2720e();
            this.f20688b.mo2726k(false);
            if (z) {
                boi boiVarMo2721f = this.f20688b.mo2721f();
                if (ewv.m7958a(dhvVar, bobVarMo2720e) == bny.AUTO) {
                    this.f20690d = true;
                }
                boiVarMo2721f.f4002s = ewv.m7958a(dhvVar, bobVarMo2720e);
                if (bobVarMo2720e.m2785e(bnx.OFF)) {
                    bnxVar = bnx.OFF;
                } else if (bobVarMo2720e.m2785e(bnx.AUTO)) {
                    bnxVar = bnx.AUTO;
                } else {
                    if (!bobVarMo2720e.m2785e(bnx.NO_FLASH)) {
                        ((nbe) ((nbe) ewv.f20695a.m17251b()).mo17276G((char) 2021)).mo17290o("no supported flash mode found, need OFF, AUTO or NO_FLASH!");
                        throw new IllegalStateException("no supported flash mode found!");
                    }
                    bnxVar = bnx.NO_FLASH;
                }
                boiVarMo2721f.f4001r = bnxVar;
                bnz bnzVar = bnz.AUTO;
                boiVarMo2721f.f4003t = (bnzVar == null || !bobVarMo2720e.f3962h.contains(bnzVar)) ? bnz.NO_SCENE_MODE : bnz.AUTO;
                boiVarMo2721f.mo2756d();
                gtd gtdVarM7957a = ewu.m7957a(bobVarMo2720e);
                bon bonVar = (bon) gtdVarM7957a.f26335b;
                this.f20692f = bonVar;
                boiVarMo2721f.m2799l(bonVar);
                ArrayList<int[]> arrayList = new ArrayList(bobVarMo2720e.f3956b);
                if (arrayList.isEmpty()) {
                    ((nbe) ((nbe) ewv.f20695a.m17251b()).mo17276G((char) 2026)).mo17290o("No suppoted frame rates returned!");
                    iArr = null;
                } else {
                    int i = 400000;
                    for (int[] iArr2 : arrayList) {
                        int i2 = iArr2[0];
                        if (iArr2[1] >= 30000 && i2 <= 30000 && i2 < i) {
                            i = i2;
                        }
                    }
                    int i3 = -1;
                    int i4 = 0;
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        int[] iArr3 = (int[]) arrayList.get(i5);
                        int i6 = iArr3[0];
                        int i7 = iArr3[1];
                        if (i6 == i && i4 < i7) {
                            i3 = i5;
                            i4 = i7;
                        }
                    }
                    if (i3 >= 0) {
                        iArr = (int[]) arrayList.get(i3);
                    } else {
                        ((nbe) ((nbe) ewv.f20695a.m17251b()).mo17276G((char) 2025)).mo17290o("Can't find an appropriate frame rate range!");
                        iArr = null;
                    }
                }
                if (iArr == null || iArr.length <= 0) {
                    ((nbe) ((nbe) ewv.f20695a.m17251b()).mo17276G((char) 2024)).mo17290o("No supported frame rates returned!");
                } else {
                    boiVarMo2721f.m2797j(iArr[0], iArr[1]);
                }
                boiVarMo2721f.f4009z = new bon(0, 0);
                boiVarMo2721f.m2796i(100);
                boiVarMo2721f.m2798k((bon) gtdVarM7957a.f26334a);
                int iM9211c = ggi.m9211c(windowManager);
                bnq bnqVar2 = this.f20688b;
                try {
                    bnqVar2.mo2723h().m2806a(new bbt(bnqVar2, iM9211c, 3));
                } catch (RuntimeException e) {
                    bnqVar2.mo2719d().mo2744c().mo2759c(e);
                }
                this.f20688b.mo2728m(boiVarMo2721f);
                float f = bobVarMo2720e.f3975u;
                StringBuilder sb = new StringBuilder();
                sb.append("Field of view reported = ");
                sb.append(f);
            }
            this.f20688b.mo2727l(this.f20693g);
            if (this.f20689c) {
                bnq bnqVar3 = this.f20688b;
                bon bonVar2 = this.f20692f;
                Handler handler = this.f20687a;
                AmbientMode.AmbientController ambientController2 = this.f20691e;
                bnqVar3.mo2731p(handler, null);
                int i8 = bnqVar3.mo2721f().f3995l;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(i8);
                if (bitsPerPixel <= 0) {
                    throw new IllegalArgumentException("Unknown image format: " + i8);
                }
                int iCeil = (int) Math.ceil(bonVar2.m2811b() * bonVar2.m2810a() * (bitsPerPixel / 8.0f));
                for (int i9 = 0; i9 < 3; i9++) {
                    bnqVar3.mo2724i(new byte[iCeil]);
                }
                bnqVar3.mo2731p(handler, ambientController2);
            } else {
                this.f20688b.mo2730o(this.f20687a, this.f20691e);
            }
            return this.f20692f;
        }
        return null;
    }
}
