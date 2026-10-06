package p000;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.camera.camcorder.p008ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import com.google.android.apps.camera.p014ui.modeslider.ModeSlider;
import com.google.android.apps.camera.smarts.SmartsChipView;
import com.google.android.apps.camera.toast.EducationToastView;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cln implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f6145a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f6146b;

    public /* synthetic */ cln(GestureDetector gestureDetector, int i) {
        this.f6146b = i;
        this.f6145a = gestureDetector;
    }

    public /* synthetic */ cln(clo cloVar, int i) {
        this.f6146b = i;
        this.f6145a = cloVar;
    }

    public cln(RecordSpeedSlider recordSpeedSlider, int i) {
        this.f6146b = i;
        this.f6145a = recordSpeedSlider;
    }

    public /* synthetic */ cln(OptionsMenuContainer optionsMenuContainer, int i) {
        this.f6146b = i;
        this.f6145a = optionsMenuContainer;
    }

    public /* synthetic */ cln(OptionsMenuView optionsMenuView, int i) {
        this.f6146b = i;
        this.f6145a = optionsMenuView;
    }

    public /* synthetic */ cln(SmartsChipView smartsChipView, int i) {
        this.f6146b = i;
        this.f6145a = smartsChipView;
    }

    public /* synthetic */ cln(EducationToastView educationToastView, int i) {
        this.f6146b = i;
        this.f6145a = educationToastView;
    }

    public cln(ModeSlider modeSlider, int i) {
        this.f6146b = i;
        this.f6145a = modeSlider;
    }

    public /* synthetic */ cln(dab dabVar, int i) {
        this.f6146b = i;
        this.f6145a = dabVar;
    }

    public cln(foc focVar, int i) {
        this.f6146b = i;
        this.f6145a = focVar;
    }

    public /* synthetic */ cln(hhr hhrVar, int i) {
        this.f6146b = i;
        this.f6145a = hhrVar;
    }

    public /* synthetic */ cln(hqk hqkVar, int i) {
        this.f6146b = i;
        this.f6145a = hqkVar;
    }

    public /* synthetic */ cln(iha ihaVar, int i) {
        this.f6146b = i;
        this.f6145a = ihaVar;
    }

    public /* synthetic */ cln(ipb ipbVar, int i) {
        this.f6146b = i;
        this.f6145a = ipbVar;
    }

    public cln(C0794lg c0794lg, int i) {
        this.f6146b = i;
        this.f6145a = c0794lg;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        switch (this.f6146b) {
            case 0:
                clo cloVar = (clo) this.f6145a;
                cloVar.m3923b();
                cloVar.m3922a();
                return false;
            case 1:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0) {
                    PopupWindow popupWindow = ((C0794lg) this.f6145a).f38188q;
                    if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < ((C0794lg) this.f6145a).f38188q.getWidth() && y >= 0 && y < ((C0794lg) this.f6145a).f38188q.getHeight()) {
                        C0794lg c0794lg = (C0794lg) this.f6145a;
                        c0794lg.f38186o.postDelayed(c0794lg.f38189r, 250L);
                    }
                } else if (action == 1) {
                    C0794lg c0794lg2 = (C0794lg) this.f6145a;
                    c0794lg2.f38186o.removeCallbacks(c0794lg2.f38189r);
                }
                return false;
            case 2:
                return ((hzp) ((dab) this.f6145a).f10216k.mo6051a()).f30074a.f30073i.equals(hzj.PHONE_LAYOUT);
            case 3:
                RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) view;
                if (!recordSpeedSlider.mo4079j()) {
                    return false;
                }
                if (((RecordSpeedSlider) this.f6145a).f6578d != null && motionEvent.getAction() == 0) {
                    ((RecordSpeedSlider) this.f6145a).f6578d.mo5805c(true);
                }
                for (int i2 = 0; i2 < recordSpeedSlider.getChildCount(); i2++) {
                    Rect rect = new Rect();
                    if (recordSpeedSlider.getChildAt(i2).getVisibility() == 0) {
                        recordSpeedSlider.getChildAt(i2).getHitRect(rect);
                        rect.top = Integer.MIN_VALUE;
                        rect.bottom = Integer.MAX_VALUE;
                        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            ((RecordSpeedSlider) this.f6145a).m4076g(i2, true);
                            if (((RecordSpeedSlider) this.f6145a).f6578d == null && motionEvent.getAction() == 1) {
                                ((RecordSpeedSlider) this.f6145a).f6578d.mo5804b(view, true);
                                return true;
                            }
                        }
                    }
                }
                return ((RecordSpeedSlider) this.f6145a).f6578d == null ? true : true;
            case 4:
                exm exmVar = ((foc) this.f6145a).f22887r;
                if (exmVar == null) {
                    return false;
                }
                switch (motionEvent.getAction() & 255) {
                    case 0:
                        return true;
                    case 1:
                    case 3:
                    case 4:
                    default:
                        return false;
                    case 2:
                        if (!exmVar.f20762d || motionEvent.getPointerCount() <= 1) {
                            return true;
                        }
                        float fM8002i = exm.m8002i(motionEvent);
                        exmVar.f20764f = fM8002i;
                        float f = fM8002i / exmVar.f20763e;
                        exp expVar = exmVar.f20760b;
                        expVar.m8021e(f);
                        expVar.f20848l = true;
                        return true;
                    case 5:
                        exmVar.f20763e = exm.m8002i(motionEvent);
                        exmVar.f20762d = true;
                        return true;
                    case 6:
                        exmVar.f20762d = false;
                        exmVar.f20760b.m8017a(exmVar.f20764f / exmVar.f20763e);
                        return true;
                }
            case 5:
                OptionsMenuContainer optionsMenuContainer = (OptionsMenuContainer) this.f6145a;
                if (optionsMenuContainer.f6831i) {
                    return optionsMenuContainer.f6832j.onTouchEvent(motionEvent);
                }
                return false;
            case 6:
                return ((OptionsMenuView) this.f6145a).f6841a.onTouchEvent(motionEvent);
            case 7:
                Object obj = this.f6145a;
                if (motionEvent.getAction() == 0) {
                    SmartsChipView smartsChipView = (SmartsChipView) obj;
                    smartsChipView.f6927a.animate().scaleX(1.1f);
                    smartsChipView.f6927a.animate().scaleY(1.1f);
                } else if (motionEvent.getAction() == 1) {
                    SmartsChipView smartsChipView2 = (SmartsChipView) obj;
                    smartsChipView2.f6927a.animate().scaleX(1.0f);
                    smartsChipView2.f6927a.animate().scaleY(1.0f);
                }
                return false;
            case 8:
                ((GestureDetector) this.f6145a).onTouchEvent(motionEvent);
                return true;
            case 9:
                return ((hhr) this.f6145a).f27838j.onTouchEvent(motionEvent);
            case 10:
                hhr hhrVar = (hhr) this.f6145a;
                if (!((ikw) hhrVar.f27834f.mo3831be()).equals(ikw.MORE_MODES) && ((hzp) hhrVar.f27833e.mo6051a()).f30074a.f30073i.equals(hzj.PHONE_LAYOUT)) {
                    Rect rect2 = ((hzp) hhrVar.f27833e.mo6051a()).f30075b.f30045i;
                    if (motionEvent.getRawX() > rect2.left && motionEvent.getRawX() < rect2.right && motionEvent.getRawY() > rect2.top && motionEvent.getRawY() < rect2.bottom) {
                        return true;
                    }
                }
                return false;
            case 11:
                return ((hhr) this.f6145a).f27838j.onTouchEvent(motionEvent);
            case 12:
                return ((hhr) this.f6145a).f27838j.onTouchEvent(motionEvent);
            case 13:
                ((hqk) this.f6145a).m10600f();
                return true;
            case 14:
                ((hqk) this.f6145a).m10600f();
                return true;
            case 15:
                EducationToastView educationToastView = (EducationToastView) this.f6145a;
                educationToastView.f6974a.run();
                educationToastView.f6975b.run();
                return false;
            case 16:
                ((GestureDetector) this.f6145a).onTouchEvent(motionEvent);
                return true;
            case 17:
                ModeSlider modeSlider = (ModeSlider) view;
                if (!modeSlider.mo4079j()) {
                    return false;
                }
                if (((ModeSlider) this.f6145a).f7051a == null || motionEvent.getAction() != 0) {
                    i = 0;
                } else {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ((ModeSlider) this.f6145a).f7051a.mo5805c(true);
                    i = 0;
                }
                while (i < modeSlider.getChildCount()) {
                    View childAt = modeSlider.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        Rect rect3 = new Rect();
                        childAt.getHitRect(rect3);
                        rect3.top = Integer.MIN_VALUE;
                        rect3.bottom = Integer.MAX_VALUE;
                        if (rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            ((ModeSlider) this.f6145a).m4382l(i, true);
                            if (((ModeSlider) this.f6145a).f7051a != null || motionEvent.getAction() != 1) {
                                return true;
                            }
                            ((ModeSlider) this.f6145a).f7051a.mo5804b(view, true);
                            if (view.getParent() == null) {
                                return true;
                            }
                            view.getParent().requestDisallowInterceptTouchEvent(false);
                            return true;
                        }
                    }
                    i++;
                }
                if (((ModeSlider) this.f6145a).f7051a != null) {
                }
                return true;
            case 18:
                Object obj2 = this.f6145a;
                if (motionEvent.getAction() != 1) {
                    if (motionEvent.getAction() != 4) {
                        return false;
                    }
                    iha ihaVar = (iha) obj2;
                    if (ihaVar.f30924g) {
                        ihaVar.f30925h.run();
                    }
                    return true;
                }
                iha ihaVar2 = (iha) obj2;
                if (ihaVar2.f30924g) {
                    ihaVar2.f30925h.run();
                }
                Iterator it = ihaVar2.f30921d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return true;
            case 19:
                return ((GestureDetector) this.f6145a).onTouchEvent(motionEvent);
            default:
                Object obj3 = this.f6145a;
                if (motionEvent.getAction() == 1) {
                    ((ipb) obj3).f31673b.mo11561c();
                }
                return true;
        }
    }
}
