package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class avf extends FrameLayout {

    /* JADX INFO: renamed from: a */
    final ArrayList f2511a;

    /* JADX INFO: renamed from: b */
    private final Context f2512b;

    /* JADX INFO: renamed from: c */
    private ave f2513c;

    /* JADX INFO: renamed from: d */
    private final AmbientModeSupport.AmbientController f2514d;

    public avf(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    protected void mo1689a() {
        int size = this.f2511a.size() - 1;
        if (size < 0) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    protected void mo1690b() {
        int size = this.f2511a.size() - 1;
        if (size < 0) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    protected void mo1691c() {
        int size = this.f2511a.size() - 1;
        if (size < 0) {
            return;
        }
        throw null;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        ave aveVar = this.f2513c;
        if (aveVar != null) {
            return i < 0 && aveVar.f2496a.getVisibility() == 0;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ave aveVar = this.f2513c;
        if (aveVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        aveVar.m2050a(motionEvent);
        if (aveVar.f2508m) {
            return true;
        }
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        motionEvent.offsetLocation(rawX, 0.0f);
        switch (motionEvent.getActionMasked()) {
            case 0:
                aveVar.m2051b();
                aveVar.f2502g = motionEvent.getRawX();
                aveVar.f2503h = motionEvent.getRawY();
                aveVar.f2501f = motionEvent.getPointerId(0);
                aveVar.f2500e.f2532f = VelocityTracker.obtain();
                aveVar.f2500e.f2532f.addMovement(motionEvent);
                break;
            case 1:
            case 3:
                aveVar.m2051b();
                break;
            case 2:
                if (aveVar.f2500e.f2532f != null && !aveVar.f2507l) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(aveVar.f2501f);
                    if (iFindPointerIndex != -1) {
                        float rawX2 = motionEvent.getRawX() - aveVar.f2502g;
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        if (rawX2 != 0.0f && aveVar.f2502g >= aveVar.f2499d && aveVar.m2053d(aveVar.f2496a, false, rawX2, x, y)) {
                            aveVar.f2507l = true;
                        } else {
                            aveVar.m2052c(motionEvent);
                        }
                    } else {
                        Log.e(DNTdN.xPIdjGQdjmXvc, "Invalid pointer index: ignoring.");
                        aveVar.f2507l = true;
                    }
                }
                break;
            case 5:
                aveVar.f2501f = motionEvent.getPointerId(motionEvent.getActionIndex());
                break;
            case 6:
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == aveVar.f2501f) {
                    aveVar.f2501f = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                }
                break;
        }
        motionEvent.offsetLocation(-rawX, 0.0f);
        return !aveVar.f2507l && aveVar.f2505j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    /* JADX WARN: Code duplicated, block: B:53:0x014b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0158  */
    /* JADX WARN: Code duplicated, block: B:58:0x017e  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        final avm avmVar;
        final AmbientModeSupport.AmbientController ambientController;
        ave aveVar = this.f2513c;
        if (aveVar != null) {
            aveVar.m2050a(motionEvent);
            final int i = 1;
            if (!aveVar.f2508m) {
                if (aveVar.f2500e.f2532f != null) {
                    float rawX = motionEvent.getRawX() - motionEvent.getX();
                    motionEvent.offsetLocation(rawX, 0.0f);
                    final int i2 = 0;
                    final byte[] bArr = null;
                    switch (motionEvent.getActionMasked()) {
                        case 1:
                            float rawX2 = motionEvent.getRawX() - aveVar.f2502g;
                            VelocityTracker velocityTracker = aveVar.f2500e.f2532f;
                            velocityTracker.computeCurrentVelocity(1000);
                            float xVelocity = velocityTracker.getXVelocity();
                            float yVelocity = velocityTracker.getYVelocity();
                            if (aveVar.f2504i == -2.1474836E9f) {
                                xVelocity = rawX2 / ((motionEvent.getEventTime() - motionEvent.getDownTime()) / 1000.0f);
                            }
                            if (!aveVar.f2506k && ((rawX2 > aveVar.f2496a.getWidth() * 0.33f && motionEvent.getRawX() >= aveVar.f2504i) || (xVelocity >= aveVar.f2498c && xVelocity > Math.abs(yVelocity)))) {
                                aveVar.f2506k = true;
                            }
                            if (aveVar.f2506k && aveVar.f2505j && xVelocity < (-aveVar.f2498c)) {
                                aveVar.f2506k = false;
                            }
                            if (aveVar.f2506k) {
                                avmVar = aveVar.f2500e;
                                ambientController = aveVar.f2509n;
                                if (avmVar.f2532f == null) {
                                    avmVar.f2532f = VelocityTracker.obtain();
                                }
                                avmVar.f2532f.computeCurrentVelocity(1000);
                                if (ambientController != null) {
                                    ((avf) ambientController.f1702a).mo1691c();
                                }
                                avmVar.f2538l = avmVar.m2057a(avmVar.f2534h, avmVar.f2528b, avmVar.f2532f.getXVelocity(), new avj(avmVar, i), new aip(avmVar, ambientController, i, bArr) { // from class: avk

                                    /* JADX INFO: renamed from: a */
                                    public final /* synthetic */ avm f2523a;

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ AmbientModeSupport.AmbientController f2524b;

                                    /* JADX INFO: renamed from: c */
                                    private final /* synthetic */ int f2525c;

                                    @Override // p000.aip
                                    /* JADX INFO: renamed from: a */
                                    public final void mo775a() {
                                        switch (this.f2525c) {
                                            case 0:
                                                avm avmVar2 = this.f2523a;
                                                AmbientModeSupport.AmbientController ambientController2 = this.f2524b;
                                                avmVar2.m2059d();
                                                if (ambientController2 != null) {
                                                    ((avf) ambientController2.f1702a).mo1689a();
                                                }
                                                break;
                                            default:
                                                avm avmVar3 = this.f2523a;
                                                AmbientModeSupport.AmbientController ambientController3 = this.f2524b;
                                                avmVar3.m2059d();
                                                if (ambientController3 != null) {
                                                    ((avf) ambientController3.f1702a).mo1690b();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else if (aveVar.f2505j && aveVar.f2504i != -2.1474836E9f) {
                                final avm avmVar2 = aveVar.f2500e;
                                final AmbientModeSupport.AmbientController ambientController2 = aveVar.f2509n;
                                avmVar2.f2532f.computeCurrentVelocity(1000);
                                avmVar2.f2539m = avmVar2.m2057a(avmVar2.f2534h, 0.0f, avmVar2.f2532f.getXVelocity(), new avj(avmVar2, i2), new aip(avmVar2, ambientController2, i2, bArr) { // from class: avk

                                    /* JADX INFO: renamed from: a */
                                    public final /* synthetic */ avm f2523a;

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ AmbientModeSupport.AmbientController f2524b;

                                    /* JADX INFO: renamed from: c */
                                    private final /* synthetic */ int f2525c;

                                    @Override // p000.aip
                                    /* JADX INFO: renamed from: a */
                                    public final void mo775a() {
                                        switch (this.f2525c) {
                                            case 0:
                                                avm avmVar3 = this.f2523a;
                                                AmbientModeSupport.AmbientController ambientController3 = this.f2524b;
                                                avmVar3.m2059d();
                                                if (ambientController3 != null) {
                                                    ((avf) ambientController3.f1702a).mo1689a();
                                                }
                                                break;
                                            default:
                                                avm avmVar4 = this.f2523a;
                                                AmbientModeSupport.AmbientController ambientController4 = this.f2524b;
                                                avmVar4.m2059d();
                                                if (ambientController4 != null) {
                                                    ((avf) ambientController4.f1702a).mo1690b();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            aveVar.m2051b();
                            break;
                        case 2:
                            aveVar.f2500e.f2532f.addMovement(motionEvent);
                            aveVar.f2504i = motionEvent.getRawX();
                            aveVar.m2052c(motionEvent);
                            if (aveVar.f2505j) {
                                avm avmVar3 = aveVar.f2500e;
                                float rawX3 = motionEvent.getRawX() - aveVar.f2502g;
                                if (!avmVar3.f2533g) {
                                    avmVar3.f2533g = true;
                                    ViewGroup viewGroup = avmVar3.f2527a.getParent() instanceof ViewGroup ? (ViewGroup) avmVar3.f2527a.getParent() : null;
                                    ViewParent parent = avmVar3.f2529c.getParent();
                                    if (viewGroup != null) {
                                        if (parent != viewGroup) {
                                            viewGroup.addView(avmVar3.f2529c);
                                            avmVar3.f2527a.bringToFront();
                                        }
                                        avmVar3.f2531e.setColorFilter(null);
                                        avmVar3.f2527a.setLayerType(2, avmVar3.f2531e);
                                        avm.m2056b(avmVar3.f2527a, avmVar3.f2530d);
                                    }
                                }
                                avmVar3.f2532f.addMovement(motionEvent);
                                float width = rawX3 / avmVar3.f2527a.getWidth();
                                avmVar3.f2536j = width;
                                float f = (width * (-0.3f)) + 1.0f;
                                avmVar3.f2535i = f;
                                avmVar3.f2534h = (Math.max(0.0f, 1.0f - f) * avmVar3.f2527a.getWidth()) / 2.0f;
                                avmVar3.f2537k = Math.min(0.3f, avmVar3.f2536j / 2.0f);
                                avmVar3.m2060e();
                            }
                            break;
                        case 3:
                            if (aveVar.f2506k) {
                                avmVar = aveVar.f2500e;
                                ambientController = aveVar.f2509n;
                                if (avmVar.f2532f == null) {
                                    avmVar.f2532f = VelocityTracker.obtain();
                                }
                                avmVar.f2532f.computeCurrentVelocity(1000);
                                if (ambientController != null) {
                                    ((avf) ambientController.f1702a).mo1691c();
                                }
                                avmVar.f2538l = avmVar.m2057a(avmVar.f2534h, avmVar.f2528b, avmVar.f2532f.getXVelocity(), new avj(avmVar, i), new aip(avmVar, ambientController, i, bArr) { // from class: avk

                                    /* JADX INFO: renamed from: a */
                                    public final /* synthetic */ avm f2523a;

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ AmbientModeSupport.AmbientController f2524b;

                                    /* JADX INFO: renamed from: c */
                                    private final /* synthetic */ int f2525c;

                                    @Override // p000.aip
                                    /* JADX INFO: renamed from: a */
                                    public final void mo775a() {
                                        switch (this.f2525c) {
                                            case 0:
                                                avm avmVar4 = this.f2523a;
                                                AmbientModeSupport.AmbientController ambientController3 = this.f2524b;
                                                avmVar4.m2059d();
                                                if (ambientController3 != null) {
                                                    ((avf) ambientController3.f1702a).mo1689a();
                                                }
                                                break;
                                            default:
                                                avm avmVar5 = this.f2523a;
                                                AmbientModeSupport.AmbientController ambientController4 = this.f2524b;
                                                avmVar5.m2059d();
                                                if (ambientController4 != null) {
                                                    ((avf) ambientController4.f1702a).mo1690b();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else if (aveVar.f2505j) {
                                final avm avmVar4 = aveVar.f2500e;
                                final AmbientModeSupport.AmbientController ambientController3 = aveVar.f2509n;
                                avmVar4.f2532f.computeCurrentVelocity(1000);
                                avmVar4.f2539m = avmVar4.m2057a(avmVar4.f2534h, 0.0f, avmVar4.f2532f.getXVelocity(), new avj(avmVar4, i2), new aip(avmVar4, ambientController3, i2, bArr) { // from class: avk

                                    /* JADX INFO: renamed from: a */
                                    public final /* synthetic */ avm f2523a;

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ AmbientModeSupport.AmbientController f2524b;

                                    /* JADX INFO: renamed from: c */
                                    private final /* synthetic */ int f2525c;

                                    @Override // p000.aip
                                    /* JADX INFO: renamed from: a */
                                    public final void mo775a() {
                                        switch (this.f2525c) {
                                            case 0:
                                                avm avmVar5 = this.f2523a;
                                                AmbientModeSupport.AmbientController ambientController4 = this.f2524b;
                                                avmVar5.m2059d();
                                                if (ambientController4 != null) {
                                                    ((avf) ambientController4.f1702a).mo1689a();
                                                }
                                                break;
                                            default:
                                                avm avmVar6 = this.f2523a;
                                                AmbientModeSupport.AmbientController ambientController5 = this.f2524b;
                                                avmVar6.m2059d();
                                                if (ambientController5 != null) {
                                                    ((avf) ambientController5.f1702a).mo1690b();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            aveVar.m2051b();
                            break;
                    }
                    motionEvent.offsetLocation(-rawX, 0.0f);
                }
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ave aveVar = this.f2513c;
        if (aveVar == null) {
            super.requestDisallowInterceptTouchEvent(z);
        } else if (aveVar.f2496a.getParent() != null) {
            aveVar.f2496a.getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public avf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public avf(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public avf(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2513c = null;
        AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(this);
        this.f2514d = ambientController;
        this.f2511a = new ArrayList();
        this.f2512b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.windowSwipeToDismiss});
        boolean z = typedArrayObtainStyledAttributes.getIndexCount() > 0 ? typedArrayObtainStyledAttributes.getBoolean(0, true) : false;
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            if (this.f2513c == null) {
                ave aveVar = new ave(context, this);
                this.f2513c = aveVar;
                aveVar.f2509n = ambientController;
                return;
            }
            return;
        }
        ave aveVar2 = this.f2513c;
        if (aveVar2 != null) {
            aveVar2.f2509n = null;
            this.f2513c = null;
        }
    }
}
