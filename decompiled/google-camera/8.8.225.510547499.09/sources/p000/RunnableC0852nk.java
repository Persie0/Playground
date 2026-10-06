package p000;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.support.wearable.complications.rendering.ComplicationDrawable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.PreferenceGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.wear.ambient.AmbientMode;
import androidx.work.CoroutineWorker;
import java.util.ArrayList;

/* JADX INFO: renamed from: nk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0852nk implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f43154a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f43155b;

    public /* synthetic */ RunnableC0852nk(acl aclVar, int i) {
        this.f43155b = i;
        this.f43154a = aclVar;
    }

    public RunnableC0852nk(ahf ahfVar, int i) {
        this.f43155b = i;
        this.f43154a = ahfVar;
    }

    public RunnableC0852nk(aia aiaVar, int i) {
        this.f43155b = i;
        this.f43154a = aiaVar;
    }

    public /* synthetic */ RunnableC0852nk(aif aifVar, int i) {
        this.f43155b = i;
        this.f43154a = aifVar;
    }

    public RunnableC0852nk(alc alcVar, int i) {
        this.f43155b = i;
        this.f43154a = alcVar;
    }

    public RunnableC0852nk(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f43155b = i;
        this.f43154a = staggeredGridLayoutManager;
    }

    public /* synthetic */ RunnableC0852nk(Toolbar toolbar, int i) {
        this.f43155b = i;
        this.f43154a = toolbar;
    }

    public RunnableC0852nk(Toolbar toolbar, int i, byte[] bArr) {
        this.f43155b = i;
        this.f43154a = toolbar;
    }

    public RunnableC0852nk(ComplicationDrawable complicationDrawable, int i) {
        this.f43155b = i;
        this.f43154a = complicationDrawable;
    }

    public RunnableC0852nk(PreferenceGroup preferenceGroup, int i) {
        this.f43155b = i;
        this.f43154a = preferenceGroup;
    }

    public RunnableC0852nk(ViewPager viewPager, int i) {
        this.f43155b = i;
        this.f43154a = viewPager;
    }

    public /* synthetic */ RunnableC0852nk(CoroutineWorker coroutineWorker, int i) {
        this.f43155b = i;
        this.f43154a = coroutineWorker;
    }

    public RunnableC0852nk(anj anjVar, int i) {
        this.f43155b = i;
        this.f43154a = anjVar;
    }

    public RunnableC0852nk(aof aofVar, int i) {
        this.f43155b = i;
        this.f43154a = aofVar;
    }

    public RunnableC0852nk(aoj aojVar, int i) {
        this.f43155b = i;
        this.f43154a = aojVar;
    }

    public RunnableC0852nk(bkn bknVar, int i, byte[] bArr, byte[] bArr2) {
        this.f43155b = i;
        this.f43154a = bknVar;
    }

    public /* synthetic */ RunnableC0852nk(ViewTreeObserverOnDrawListenerC0906pk viewTreeObserverOnDrawListenerC0906pk, int i) {
        this.f43155b = i;
        this.f43154a = viewTreeObserverOnDrawListenerC0906pk;
    }

    public /* synthetic */ RunnableC0852nk(ActivityC0907pl activityC0907pl, int i) {
        this.f43155b = i;
        this.f43154a = activityC0907pl;
    }

    public RunnableC0852nk(ActivityC0907pl activityC0907pl, int i, byte[] bArr) {
        this.f43155b = i;
        this.f43154a = activityC0907pl;
    }

    public /* synthetic */ RunnableC0852nk(DialogC0908pm dialogC0908pm, int i) {
        this.f43155b = i;
        this.f43154a = dialogC0908pm;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f43155b) {
            case 0:
                Toolbar toolbar = (Toolbar) this.f43154a;
                ArrayList arrayList = toolbar.f1245v;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    toolbar.m1339g().removeItem(((MenuItem) arrayList.get(i)).getItemId());
                }
                Menu menuM1339g = toolbar.m1339g();
                ArrayList arrayListM1342j = toolbar.m1342j();
                toolbar.f1206B.m19477e(menuM1339g, toolbar.m1340h());
                ArrayList arrayListM1342j2 = toolbar.m1342j();
                arrayListM1342j2.removeAll(arrayListM1342j);
                toolbar.f1245v = arrayListM1342j2;
                return;
            case 1:
                ((StaggeredGridLayoutManager) this.f43154a).m1293I();
                return;
            case 2:
                ((Toolbar) this.f43154a).m1343k();
                return;
            case 3:
                ((Toolbar) this.f43154a).m1356x();
                return;
            case 4:
                ((ComplicationDrawable) this.f43154a).setIsHighlighted(false);
                ((ComplicationDrawable) this.f43154a).invalidateSelf();
                return;
            case 5:
                ((ActivityC0907pl) this.f43154a).invalidateOptionsMenu();
                return;
            case 6:
                try {
                    super/*do*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                }
            case 7:
                ViewTreeObserverOnDrawListenerC0906pk viewTreeObserverOnDrawListenerC0906pk = (ViewTreeObserverOnDrawListenerC0906pk) this.f43154a;
                Runnable runnable = viewTreeObserverOnDrawListenerC0906pk.f47417b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0906pk.f47417b = null;
                    return;
                }
                return;
            case 8:
                DialogC0908pm.m19321e((DialogC0908pm) this.f43154a);
                return;
            case 9:
                ((acl) this.f43154a).mo199b();
                return;
            case 10:
                Object obj2 = ((bkn) this.f43154a).f3651a;
                if (obj2 != null) {
                    ((acl) obj2).mo199b();
                    return;
                }
                return;
            case 11:
                ahf ahfVar = (ahf) this.f43154a;
                if (ahfVar.f380e) {
                    if (ahfVar.f378c) {
                        ahfVar.f378c = false;
                        ahe aheVar = ahfVar.f376a;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aheVar.f370e = jCurrentAnimationTimeMillis;
                        aheVar.f372g = -1L;
                        aheVar.f371f = jCurrentAnimationTimeMillis;
                        aheVar.f373h = 0.5f;
                    }
                    ahe aheVar2 = ((ahf) this.f43154a).f376a;
                    if ((aheVar2.f372g > 0 && AnimationUtils.currentAnimationTimeMillis() > aheVar2.f372g + ((long) aheVar2.f374i)) || !((ahf) this.f43154a).m663b()) {
                        ((ahf) this.f43154a).f380e = false;
                        return;
                    }
                    ahf ahfVar2 = (ahf) this.f43154a;
                    if (ahfVar2.f379d) {
                        ahfVar2.f379d = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        ahfVar2.f377b.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aheVar2.f371f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM658a = aheVar2.m658a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - aheVar2.f371f;
                    aheVar2.f371f = jCurrentAnimationTimeMillis2;
                    ahk.m677a(((ahf) this.f43154a).f381f, (int) (j * (((-4.0f) * fM658a * fM658a) + (fM658a * 4.0f)) * aheVar2.f369d));
                    afb.m428i(((ahf) this.f43154a).f377b, this);
                    return;
                }
                return;
            case 12:
                ((aia) this.f43154a).m745f(0);
                return;
            case 13:
                AmbientMode.AmbientController ambientController = ((aif) this.f43154a).f437i;
                ((aif) ambientController.f1697a).f432d = SystemClock.uptimeMillis();
                aif aifVar = (aif) ambientController.f1697a;
                long j2 = aifVar.f432d;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                for (int i2 = 0; i2 < aifVar.f430b.size(); i2++) {
                    aib aibVar = (aib) aifVar.f430b.get(i2);
                    if (aibVar != null) {
                        Long l = (Long) aifVar.f429a.get(aibVar);
                        if (l == null) {
                            aibVar.mo752a(j2);
                        } else if (l.longValue() < jUptimeMillis2) {
                            aifVar.f429a.remove(aibVar);
                            aibVar.mo752a(j2);
                        }
                    }
                }
                if (aifVar.f433e) {
                    for (int size2 = aifVar.f430b.size() - 1; size2 >= 0; size2--) {
                        if (aifVar.f430b.get(size2) == null) {
                            aifVar.f430b.remove(size2);
                        }
                    }
                    if (aifVar.f430b.size() == 0) {
                        aid aidVar = aifVar.f436h;
                        ValueAnimator.unregisterDurationScaleChangeListener(aidVar.f424a);
                        aidVar.f424a = null;
                    }
                    aifVar.f433e = false;
                }
                if (((aif) ambientController.f1697a).f430b.size() > 0) {
                    aif aifVar2 = (aif) ambientController.f1697a;
                    aifVar2.f435g.m756a(aifVar2.f431c);
                    return;
                }
                return;
            case 14:
                synchronized (((alc) this.f43154a).f624b) {
                    obj = ((alc) this.f43154a).f629g;
                    ((alc) this.f43154a).f629g = alc.f623a;
                    break;
                }
                ((alc) this.f43154a).mo904g(obj);
                return;
            case 15:
                anj anjVar = (anj) this.f43154a;
                if (anjVar.f1835af == -1 || SystemClock.currentThreadTimeMillis() >= 1000) {
                    return;
                }
                EditText editText = anjVar.f1833ad;
                if (editText == null || !editText.isFocused()) {
                    anjVar.m1727C();
                    return;
                } else if (((InputMethodManager) anjVar.f1833ad.getContext().getSystemService("input_method")).showSoftInput(anjVar.f1833ad, 0)) {
                    anjVar.m1727C();
                    return;
                } else {
                    anjVar.f1833ad.removeCallbacks(anjVar.f1834ae);
                    anjVar.f1833ad.postDelayed(anjVar.f1834ae, 50L);
                    return;
                }
            case 16:
                RecyclerView recyclerView = ((aof) this.f43154a).f1884b;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 17:
                synchronized (this) {
                    ((PreferenceGroup) this.f43154a).f1599a.clear();
                    break;
                }
                return;
            case 18:
                ((aoj) this.f43154a).m1768k();
                return;
            case 19:
                ((ViewPager) this.f43154a).m1549a(0);
                return;
            default:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f43154a;
                if (coroutineWorker.f1793b.isCancelled()) {
                    coroutineWorker.f1792a.mo18977r(null);
                    return;
                }
                return;
        }
    }
}
