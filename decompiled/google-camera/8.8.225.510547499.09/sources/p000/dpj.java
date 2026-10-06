package p000;

import android.animation.ObjectAnimator;
import android.widget.CheckBox;
import com.google.android.apps.camera.evcomp.EvCompView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dpj extends dpe {

    /* JADX INFO: renamed from: a */
    public final EvCompView f12210a;

    /* JADX INFO: renamed from: b */
    public final CheckBox f12211b;

    /* JADX INFO: renamed from: c */
    public final ObjectAnimator f12212c;

    /* JADX INFO: renamed from: d */
    public final dpo f12213d;

    /* JADX INFO: renamed from: e */
    public final jww f12214e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, jww] */
    public dpj(EvCompView evCompView, CheckBox checkBox, ObjectAnimator objectAnimator, dpo dpoVar, djm djmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f12210a = evCompView;
        this.f12211b = checkBox;
        this.f12212c = objectAnimator;
        this.f12213d = dpoVar;
        this.f12214e = djmVar.f11787a;
        objectAnimator.addListener(new dpf(evCompView, 0));
    }

    /* JADX INFO: renamed from: i */
    public final void m6546i(boolean z, boolean z2) {
        if (z2) {
            this.f12213d.m6552j();
        }
        if (z) {
            this.f12212c.start();
        } else {
            this.f12212c.cancel();
            this.f12210a.setAlpha(1.0f);
        }
    }
}
