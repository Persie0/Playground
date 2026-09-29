package p000;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.amplitude.android.C0881c;
import com.amplitude.android.internal.AbstractC0885b;
import com.amplitude.android.internal.C0884a;
import com.amplitude.android.internal.ViewTarget$Type;
import com.amplitude.android.internal.gestures.WindowCallbackC0887b;
import com.amplitude.core.AbstractC0903a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class mi3 extends WindowCallbackC0887b {

    /* JADX INFO: renamed from: i */
    public final ui3 f51354i;

    /* JADX INFO: renamed from: j */
    public final C0881c f51355j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi3(Window.Callback callback, View view, String str, zi3 zi3Var, List list, pj5 pj5Var, ui3 ui3Var, C0881c c0881c) {
        super(callback, view, str, zi3Var, list, pj5Var, ui3Var);
        view.getClass();
        list.getClass();
        pj5Var.getClass();
        this.f51354i = ui3Var;
        this.f51355j = c0881c;
    }

    @Override // com.amplitude.android.internal.gestures.WindowCallbackC0887b, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C0881c c0881c;
        boolean z;
        ui3 ui3Var;
        r84 r84Var;
        String str;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent != null && (c0881c = this.f51355j) != null) {
            ConcurrentHashMap concurrentHashMap = c0881c.f10815f;
            if (motionEvent.getAction() == 1) {
                v50 v50Var = (v50) this.f51354i.mo0a();
                List list = v50Var.f64878e;
                t84 t84Var = t84.f61982a;
                boolean zContains = list.contains(t84Var);
                r84 r84Var2 = r84.f58876a;
                if (!zContains && !v50Var.f64878e.contains(r84Var2)) {
                    this.f10850h = null;
                    return zDispatchTouchEvent;
                }
                View view = (View) this.f10849g.get();
                pj5 pj5Var = this.f10846d;
                if (view == null) {
                    pj5Var.mo16255a("DecorView is null in handleFrustrationInteraction()");
                    return zDispatchTouchEvent;
                }
                kva kvaVarM5072b = this.f10850h;
                if (kvaVarM5072b != null) {
                    this.f10850h = null;
                } else {
                    kvaVarM5072b = C0884a.m5072b(pj5Var, view, ViewTarget$Type.Clickable, this.f10845c, new Pair(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY())));
                    if (kvaVarM5072b == null) {
                        pj5Var.mo16256b("Unable to find click target for frustration interaction");
                        return zDispatchTouchEvent;
                    }
                }
                boolean z2 = kvaVarM5072b.f48486j;
                boolean z3 = kvaVarM5072b.f48485i;
                if (z3 && z2) {
                    pj5Var.mo16256b("Ignoring all frustration interactions for target: " + kvaVarM5072b.f48478b);
                    return zDispatchTouchEvent;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                System.currentTimeMillis();
                String str2 = kvaVarM5072b.f48478b;
                pi3 pi3Var = new pi3(str2, kvaVarM5072b.f48479c, kvaVarM5072b.f48480d, kvaVarM5072b.f48481e, kvaVarM5072b.f48483g, kvaVarM5072b.f48484h);
                String str3 = str2;
                ui3 ui3Var2 = c0881c.f10812c;
                pj5 pj5Var2 = c0881c.f10811b;
                String str4 = this.f10844b;
                str4.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                System.currentTimeMillis();
                if (!((v50) ui3Var2.mo0a()).f64878e.contains(t84Var)) {
                    z = z2;
                    ui3Var = ui3Var2;
                    r84Var = r84Var2;
                } else if (z3) {
                    z = z2;
                    ui3Var = ui3Var2;
                    r84Var = r84Var2;
                    StringBuilder sb = new StringBuilder("Skipping rage click processing for ignored target: ");
                    str3 = str3;
                    sb.append(str3);
                    pj5Var2.mo16256b(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append('_');
                    float f = c0881c.f10813d;
                    sb2.append((int) (x / f));
                    sb2.append('_');
                    sb2.append((int) (y / f));
                    String string = sb2.toString();
                    oi3 oi3Var = (oi3) concurrentHashMap.get(string);
                    if (oi3Var != null) {
                        z = z2;
                        ArrayList arrayList = oi3Var.f54374g;
                        ui3Var = ui3Var2;
                        float f2 = oi3Var.f54372e;
                        float f3 = oi3Var.f54371d;
                        r84Var = r84Var2;
                        long j = oi3Var.f54368a;
                        if (jCurrentTimeMillis - j <= 1000) {
                            PointF pointF = new PointF(x, y);
                            PointF pointF2 = new PointF(f3, f2);
                            str = str3;
                            if (PointF.length(pointF.x - pointF2.x, pointF.y - pointF2.y) <= f) {
                                oi3Var.f54370c++;
                                oi3Var.f54369b = jCurrentTimeMillis;
                                arrayList.add(new ni3(x, y, jCurrentTimeMillis));
                                if (oi3Var.f54370c >= 4) {
                                    Map mapM5073a = AbstractC0885b.m5073a(kvaVarM5072b, str4);
                                    Pair pair = new Pair("[Amplitude] Begin Time", Long.valueOf(j));
                                    Pair pair2 = new Pair("[Amplitude] End Time", Long.valueOf(oi3Var.f54369b));
                                    Pair pair3 = new Pair("[Amplitude] Duration", Long.valueOf(oi3Var.f54369b - j));
                                    Pair pair4 = new Pair("[Amplitude] X", Integer.valueOf((int) f3));
                                    Pair pair5 = new Pair("[Amplitude] Y", Integer.valueOf((int) f2));
                                    Pair pair6 = new Pair("[Amplitude] Click Count", Integer.valueOf(oi3Var.f54370c));
                                    ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        ni3 ni3Var = (ni3) it.next();
                                        arrayList2.add(AbstractC3194a.m15365R(new Pair("[Amplitude] X", Integer.valueOf((int) ni3Var.f52754a)), new Pair("[Amplitude] Y", Integer.valueOf((int) ni3Var.f52755b)), new Pair("timestamp", Long.valueOf(ni3Var.f52756c))));
                                        it = it;
                                        pair = pair;
                                        pair2 = pair2;
                                        pair3 = pair3;
                                        pair5 = pair5;
                                    }
                                    AbstractC0903a.m5107l(c0881c.f10810a, "[Amplitude] Rage Click", AbstractC3194a.m15367T(mapM5073a, AbstractC3194a.m15365R(pair, pair2, pair3, pair4, pair5, pair6, new Pair("[Amplitude] Clicks", arrayList2))), 4);
                                    pj5Var2.mo16256b("Rage click detected with " + oi3Var.f54370c + " clicks");
                                    concurrentHashMap.remove(string);
                                }
                            } else {
                                concurrentHashMap.put(string, new oi3(jCurrentTimeMillis, jCurrentTimeMillis, x, y, pi3Var, vz1.m23608N(new ni3(x, y, jCurrentTimeMillis))));
                            }
                        } else {
                            str = str3;
                            concurrentHashMap.put(string, new oi3(jCurrentTimeMillis, jCurrentTimeMillis, x, y, pi3Var, vz1.m23608N(new ni3(x, y, jCurrentTimeMillis))));
                        }
                    } else {
                        str = str3;
                        z = z2;
                        ui3Var = ui3Var2;
                        r84Var = r84Var2;
                        concurrentHashMap.put(string, new oi3(jCurrentTimeMillis, jCurrentTimeMillis, x, y, pi3Var, vz1.m23608N(new ni3(x, y, jCurrentTimeMillis))));
                    }
                    str3 = str;
                }
                if (!((v50) ui3Var.mo0a()).f64878e.contains(r84Var)) {
                    return zDispatchTouchEvent;
                }
                if (z) {
                    pj5Var2.mo16256b("Skipping dead click processing for ignored target: " + str3);
                    return zDispatchTouchEvent;
                }
                pg9 pg9Var = c0881c.f10814e;
                if (pg9Var == null || !pg9Var.mo4538b()) {
                    pj5Var2.mo16255a("Dead click detection is disabled - call start() to enable.");
                    return zDispatchTouchEvent;
                }
                pj5Var2.mo16255a("Dead click detection is disabled - no UI change signals observed yet. Ensure SessionReplay plugin is active.");
                return zDispatchTouchEvent;
            }
        }
        return zDispatchTouchEvent;
    }
}
