package p000;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.media.MediaActionSound;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmt extends bnu {

    /* JADX INFO: renamed from: a */
    public static final boo f3831a = new boo("AndCam2AgntImp");

    /* JADX INFO: renamed from: b */
    public final bmr f3832b;

    /* JADX INFO: renamed from: c */
    public final boj f3833c;

    /* JADX INFO: renamed from: d */
    public final bok f3834d;

    /* JADX INFO: renamed from: e */
    public final CameraManager f3835e;

    /* JADX INFO: renamed from: f */
    public final MediaActionSound f3836f;

    /* JADX INFO: renamed from: g */
    public boh f3837g;

    /* JADX INFO: renamed from: h */
    public final List f3838h;

    /* JADX INFO: renamed from: j */
    private final HandlerThread f3839j;

    /* JADX INFO: renamed from: k */
    private int f3840k;

    public bmt(Context context) {
        HandlerThread handlerThread = new HandlerThread("Camera2 Handler Thread");
        this.f3839j = handlerThread;
        handlerThread.start();
        bmr bmrVar = new bmr(this, handlerThread.getLooper());
        this.f3832b = bmrVar;
        this.f3837g = new boh(bmrVar);
        this.f3833c = new boj();
        bok bokVar = new bok(bmrVar, handlerThread);
        this.f3834d = bokVar;
        bokVar.start();
        this.f3835e = (CameraManager) context.getSystemService("camera");
        MediaActionSound mediaActionSound = new MediaActionSound();
        this.f3836f = mediaActionSound;
        mediaActionSound.load(0);
        this.f3840k = 0;
        this.f3838h = new ArrayList();
        m2741h();
    }

    /* JADX INFO: renamed from: h */
    private final void m2741h() {
        try {
            String[] cameraIdList = this.f3835e.getCameraIdList();
            HashSet hashSet = new HashSet(Arrays.asList(cameraIdList));
            for (int i = 0; i < this.f3838h.size(); i++) {
                if (!hashSet.contains(this.f3838h.get(i))) {
                    this.f3838h.set(i, null);
                    this.f3840k--;
                }
            }
            hashSet.removeAll(this.f3838h);
            for (String str : cameraIdList) {
                if (hashSet.contains(str)) {
                    this.f3838h.add(str);
                    this.f3840k++;
                }
            }
        } catch (CameraAccessException e) {
            bop.m2813b(f3831a, "Could not get device listing from camera subsystem", e);
        }
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: a */
    public final Handler mo2742a() {
        return this.f3832b;
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: b */
    public final bod mo2743b() {
        m2741h();
        return new bmi(this.f3835e, (String[]) this.f3838h.toArray(new String[0]));
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: c */
    public final boh mo2744c() {
        return this.f3837g;
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: d */
    protected final boj mo2745d() {
        return this.f3833c;
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: e */
    public final bok mo2746e() {
        return this.f3834d;
    }

    @Override // p000.bnu
    /* JADX INFO: renamed from: f */
    public final void mo2747f(boh bohVar) {
        this.f3837g = bohVar;
    }
}
