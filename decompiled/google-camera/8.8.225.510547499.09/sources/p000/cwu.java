package p000;

import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.RectF;
import com.google.android.apps.camera.p014ui.captureframe.CaptureFrameUi;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cwu implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f9898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9899b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f9900c;

    public /* synthetic */ cwu(avw avwVar, otq otqVar, int i) {
        this.f9900c = i;
        this.f9898a = avwVar;
        this.f9899b = otqVar;
    }

    public /* synthetic */ cwu(cdu cduVar, fmz fmzVar, int i) {
        this.f9900c = i;
        this.f9898a = cduVar;
        this.f9899b = fmzVar;
    }

    public /* synthetic */ cwu(CaptureFrameUi captureFrameUi, Canvas canvas, int i) {
        this.f9900c = i;
        this.f9899b = captureFrameUi;
        this.f9898a = canvas;
    }

    public /* synthetic */ cwu(ShutterButton shutterButton, ign ignVar, int i) {
        this.f9900c = i;
        this.f9898a = shutterButton;
        this.f9899b = ignVar;
    }

    public /* synthetic */ cwu(cwd cwdVar, kmd kmdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f9900c = i;
        this.f9898a = cwdVar;
        this.f9899b = kmdVar;
    }

    public /* synthetic */ cwu(gyu gyuVar, kbb kbbVar, int i) {
        this.f9900c = i;
        this.f9898a = gyuVar;
        this.f9899b = kbbVar;
    }

    public /* synthetic */ cwu(ifz ifzVar, mrm mrmVar, int i) {
        this.f9900c = i;
        this.f9898a = ifzVar;
        this.f9899b = mrmVar;
    }

    public /* synthetic */ cwu(Set set, Set set2, int i) {
        this.f9900c = i;
        this.f9898a = set;
        this.f9899b = set2;
    }

    public /* synthetic */ cwu(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, int i) {
        this.f9900c = i;
        this.f9898a = atomicInteger;
        this.f9899b = atomicInteger2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, otq] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        avx avxVar;
        switch (this.f9900c) {
            case 0:
                ((cwd) this.f9898a).f9866a.put((cxk) obj, Float.valueOf(this.f9899b.mo14550c()));
                break;
            case 1:
                Object obj2 = this.f9898a;
                ?? r2 = this.f9899b;
                Integer num = (Integer) obj;
                num.getClass();
                switch (num.intValue()) {
                    case 1:
                        avxVar = avx.f2561b;
                        break;
                    case 2:
                        avxVar = avx.f2562c;
                        break;
                    default:
                        avxVar = avx.f2560a;
                        break;
                }
                avw avwVar = (avw) obj2;
                avwVar.f2559d = avxVar;
                avx avxVar2 = avwVar.f2559d;
                if (avxVar2 == null) {
                    avxVar2 = avx.f2560a;
                }
                r2.mo19057s(avxVar2);
                break;
            case 2:
                ?? r1 = this.f9898a;
                ?? r3 = this.f9899b;
                gfb gfbVar = (gfb) obj;
                if (!r1.add(gfbVar.mo5771g())) {
                    r3.add(gfbVar.mo5771g());
                }
                break;
            case 3:
                Object obj3 = this.f9898a;
                Object obj4 = this.f9899b;
                nbh nbhVar = gfy.f24631a;
                ((cdu) obj3).m3529i().m13537d(((fmz) obj4).f22756c.mo3830a(new gcu((gfa) obj, 14), not.INSTANCE));
                break;
            case 4:
                ((gyi) obj).mo3963p((gyu) this.f9898a, (kbb) this.f9899b);
                break;
            case 5:
                Object obj5 = this.f9898a;
                Object obj6 = this.f9899b;
                int i = hfx.f27636f;
                if (!((hhs) obj).f27856b) {
                    ((AtomicInteger) obj6).getAndIncrement();
                } else {
                    ((AtomicInteger) obj5).getAndIncrement();
                }
                break;
            case 6:
                Object obj7 = this.f9899b;
                Object obj8 = this.f9898a;
                hsz hszVar = (hsz) obj;
                RectF rectF = ((CaptureFrameUi) obj7).f6993a;
                if (hszVar.f29480c.getVisibility() == 0) {
                    float fMin = Math.min(rectF.width(), rectF.height()) * 0.09f;
                    switch (hszVar.f29481d - 1) {
                        case 0:
                            float f = rectF.left;
                            float f2 = rectF.top;
                            float f3 = rectF.left;
                            float f4 = hszVar.f29479b;
                            float f5 = f3 + f4 + f4;
                            float f6 = rectF.top;
                            float f7 = hszVar.f29479b;
                            Canvas canvas = (Canvas) obj8;
                            canvas.drawArc(new RectF(f, f2, f5, f6 + f7 + f7), 180.0f, 90.0f, false, hszVar.f29478a);
                            canvas.drawLine((rectF.left + hszVar.f29479b) - 1.0f, rectF.top, rectF.left + fMin, rectF.top, hszVar.f29478a);
                            canvas.drawLine(rectF.left, (rectF.top + hszVar.f29479b) - 1.0f, rectF.left, rectF.top + fMin, hszVar.f29478a);
                            break;
                        case 1:
                            float f8 = rectF.right;
                            float f9 = hszVar.f29479b;
                            float f10 = f8 - (f9 + f9);
                            float f11 = rectF.top;
                            float f12 = rectF.right;
                            float f13 = rectF.top;
                            float f14 = hszVar.f29479b;
                            Canvas canvas2 = (Canvas) obj8;
                            canvas2.drawArc(new RectF(f10, f11, f12, f13 + f14 + f14), 270.0f, 90.0f, false, hszVar.f29478a);
                            canvas2.drawLine(rectF.right - fMin, rectF.top, (rectF.right - hszVar.f29479b) + 1.0f, rectF.top, hszVar.f29478a);
                            canvas2.drawLine(rectF.right, (rectF.top + hszVar.f29479b) - 1.0f, rectF.right, rectF.top + fMin, hszVar.f29478a);
                            break;
                        case 2:
                            float f15 = rectF.left;
                            float f16 = rectF.bottom;
                            float f17 = hszVar.f29479b;
                            float f18 = f16 - (f17 + f17);
                            float f19 = rectF.left;
                            float f20 = hszVar.f29479b;
                            Canvas canvas3 = (Canvas) obj8;
                            canvas3.drawArc(new RectF(f15, f18, f19 + f20 + f20, rectF.bottom), 90.0f, 90.0f, false, hszVar.f29478a);
                            canvas3.drawLine((rectF.left + hszVar.f29479b) - 1.0f, rectF.bottom, rectF.left + fMin, rectF.bottom, hszVar.f29478a);
                            canvas3.drawLine(rectF.left, rectF.bottom - fMin, rectF.left, (rectF.bottom - hszVar.f29479b) + 1.0f, hszVar.f29478a);
                            break;
                        default:
                            float f21 = rectF.right;
                            float f22 = hszVar.f29479b;
                            float f23 = f21 - (f22 + f22);
                            float f24 = rectF.bottom;
                            float f25 = hszVar.f29479b;
                            Canvas canvas4 = (Canvas) obj8;
                            canvas4.drawArc(new RectF(f23, f24 - (f25 + f25), rectF.right, rectF.bottom), 0.0f, 90.0f, false, hszVar.f29478a);
                            canvas4.drawLine(rectF.right - fMin, rectF.bottom, (rectF.right - hszVar.f29479b) + 1.0f, rectF.bottom, hszVar.f29478a);
                            canvas4.drawLine(rectF.right, rectF.bottom - fMin, rectF.right, (rectF.bottom - hszVar.f29479b) + 1.0f, hszVar.f29478a);
                            break;
                    }
                }
                break;
            case 7:
                ((ShutterButton) this.f9898a).m4429x7a0dc3((ign) this.f9899b, (Animator) obj);
                break;
            case 8:
                ((ifz) this.f9898a).f30695a.f30701b.inFlightSpecBuilder.m11271h((mrm) this.f9899b);
                break;
            default:
                ((ifz) this.f9898a).f30695a.f30701b.inFlightSpecBuilder.m11271h((mrm) this.f9899b);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f9900c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
