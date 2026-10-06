package p000;

import android.util.AndroidRuntimeException;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.p014ui.modeswitcher.ModeSwitcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class icm extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: b */
    public long f30360b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ModeSwitcher f30361c;

    /* JADX INFO: renamed from: a */
    public ikw f30359a = ikw.UNINITIALIZED;

    /* JADX INFO: renamed from: d */
    public int f30362d = 1;

    /* JADX INFO: renamed from: e */
    private ait f30363e = new ait(new gtx(0.0f), null);

    public icm(ModeSwitcher modeSwitcher) {
        this.f30361c = modeSwitcher;
    }

    /* JADX INFO: renamed from: a */
    public final void m11068a(boolean z) {
        nbh nbhVar = ModeSwitcher.f7060a;
        icn icnVar = this.f30361c.f7061b;
        if (icnVar != null) {
            icr icrVar = (icr) icnVar;
            if (icrVar.f30375d.f7070k == ikw.MORE_MODES) {
                icrVar.f30376e.m4401d(!z);
            } else {
                icrVar.f30377f.mo11199G(!z);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f30359a = this.f30361c.f7070k;
        this.f30360b = motionEvent.getEventTime();
        m11068a(true);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        nbh nbhVar = ModeSwitcher.f7060a;
        if (!this.f30361c.f7071l.equals(ikw.UNINITIALIZED)) {
            ModeSwitcher modeSwitcher = this.f30361c;
            modeSwitcher.f7070k = modeSwitcher.f7071l;
            modeSwitcher.f7071l = ikw.UNINITIALIZED;
        }
        ait aitVar = this.f30363e;
        if (!aif.m771a().m772b()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (aitVar.f453m) {
            aitVar.m786j();
        }
        float scrollX = this.f30361c.getScrollX();
        float fM4386a = -f;
        this.f30361c.f7069j.mo11071c();
        this.f30361c.f7069j.mo11070b();
        this.f30361c.f7069j.mo11069a();
        if (Math.abs(fM4386a) > 15000.0f) {
            f3 = 0.1f;
        } else {
            lku.m15607B(true, "absMaxVelocity %s must be non-negative", Float.valueOf(1300.0f));
            fM4386a = ModeSwitcher.m4386a(fM4386a, -1300.0f, 1300.0f);
            f3 = 15.0f;
        }
        float width = this.f30361c.f7062c.getWidth();
        float width2 = this.f30361c.getWidth();
        float f4 = width - width2;
        if (f4 < 0.0f) {
            ((nbe) ((nbe) ModeSwitcher.f7060a.m17252c()).mo17276G(4136)).mo17278I(width, width2);
            f4 = 0.0f;
        }
        ait aitVar2 = new ait(new gtx(ModeSwitcher.m4386a(scrollX, 0.0f, f4)), null);
        aitVar2.m787k();
        aitVar2.f454n = f4;
        aitVar2.f460q.f23131a = f3 * (-4.2f);
        aitVar2.f448h = fM4386a;
        aitVar2.m783g(new avj(this, 2));
        aitVar2.m782f(new icl(this, 0));
        this.f30363e = aitVar2;
        aitVar2.mo780d();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        nbh nbhVar = ModeSwitcher.f7060a;
        ikw ikwVarM4388b = this.f30361c.m4388b();
        ModeSwitcher modeSwitcher = this.f30361c;
        if (modeSwitcher.f7071l.equals(ikw.UNINITIALIZED) || modeSwitcher.f7071l.equals(ikwVarM4388b)) {
            modeSwitcher.f7071l = ikwVarM4388b;
            return false;
        }
        modeSwitcher.f7071l = ikwVarM4388b;
        npk.m17604h(modeSwitcher);
        modeSwitcher.f7062c.m11066d(ikwVarM4388b);
        this.f30362d = motionEvent2.getEventTime() - this.f30360b >= 500 ? 6 : 5;
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        nbh nbhVar = ModeSwitcher.f7060a;
        ModeSwitcher modeSwitcher = this.f30361c;
        if (!modeSwitcher.f7065f) {
            if (!modeSwitcher.f7071l.equals(ikw.UNINITIALIZED)) {
                ModeSwitcher modeSwitcher2 = this.f30361c;
                modeSwitcher2.f7062c.m11064b(modeSwitcher2.f7070k, false);
                this.f30361c.f7071l = ikw.UNINITIALIZED;
            }
            return true;
        }
        if (modeSwitcher.f7063d.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        ikw ikwVarM4388b = this.f30361c.m4388b();
        this.f30361c.getScrollX();
        this.f30361c.getScrollY();
        if (this.f30361c.f7067h != null && this.f30359a != ikw.UNINITIALIZED) {
            this.f30361c.f7067h.mo8158ac(6, this.f30359a.toString(), ikwVarM4388b.toString());
        }
        this.f30361c.m4394h(ikwVarM4388b);
        this.f30359a = ikw.UNINITIALIZED;
        this.f30360b = 0L;
        this.f30361c.f7071l = ikw.UNINITIALIZED;
        m11068a(false);
        return true;
    }
}
