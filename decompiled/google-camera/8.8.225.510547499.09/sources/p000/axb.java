package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axb implements aea {

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f2627a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final Set f2628b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    private final Context f2629c;

    /* JADX INFO: renamed from: d */
    private awx f2630d;

    public axb(Context context) {
        this.f2629c = context;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006b A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x006d A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:3:0x0008, B:4:0x0040, B:6:0x0046, B:8:0x0051, B:9:0x005a, B:11:0x005f, B:13:0x0064, B:14:0x0068, B:16:0x006d, B:18:0x0072, B:20:0x008a, B:23:0x0091, B:25:0x009b, B:28:0x00a6, B:30:0x00b0, B:33:0x00bb, B:35:0x00c5, B:38:0x00d0, B:17:0x0070, B:12:0x0062, B:41:0x00e4, B:42:0x00e9, B:43:0x00f6, B:45:0x00fc), top: B:53:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0070 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:3:0x0008, B:4:0x0040, B:6:0x0046, B:8:0x0051, B:9:0x005a, B:11:0x005f, B:13:0x0064, B:14:0x0068, B:16:0x006d, B:18:0x0072, B:20:0x008a, B:23:0x0091, B:25:0x009b, B:28:0x00a6, B:30:0x00b0, B:33:0x00bb, B:35:0x00c5, B:38:0x00d0, B:17:0x0070, B:12:0x0062, B:41:0x00e4, B:42:0x00e9, B:43:0x00f6, B:45:0x00fc), top: B:53:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x008a A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:3:0x0008, B:4:0x0040, B:6:0x0046, B:8:0x0051, B:9:0x005a, B:11:0x005f, B:13:0x0064, B:14:0x0068, B:16:0x006d, B:18:0x0072, B:20:0x008a, B:23:0x0091, B:25:0x009b, B:28:0x00a6, B:30:0x00b0, B:33:0x00bb, B:35:0x00c5, B:38:0x00d0, B:17:0x0070, B:12:0x0062, B:41:0x00e4, B:42:0x00e9, B:43:0x00f6, B:45:0x00fc), top: B:53:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0091 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:3:0x0008, B:4:0x0040, B:6:0x0046, B:8:0x0051, B:9:0x005a, B:11:0x005f, B:13:0x0064, B:14:0x0068, B:16:0x006d, B:18:0x0072, B:20:0x008a, B:23:0x0091, B:25:0x009b, B:28:0x00a6, B:30:0x00b0, B:33:0x00bb, B:35:0x00c5, B:38:0x00d0, B:17:0x0070, B:12:0x0062, B:41:0x00e4, B:42:0x00e9, B:43:0x00f6, B:45:0x00fc), top: B:53:0x0008 }] */
    @Override // p000.aea
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void mo309a(WindowLayoutInfo windowLayoutInfo) {
        awp awpVar;
        awo awoVar;
        avy avyVar;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.f2627a;
        reentrantLock.lock();
        try {
            Context context = this.f2629c;
            int i = awz.f2624a;
            WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
            ago agoVarM601m = ago.m601m(windowManager.getCurrentWindowMetrics().getWindowInsets());
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            bounds.getClass();
            awy awyVar = new awy(bounds, agoVarM601m);
            List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
            displayFeatures.getClass();
            ArrayList arrayList = new ArrayList();
            for (FoldingFeature foldingFeature : displayFeatures) {
                awq awqVar = null;
                if (foldingFeature instanceof FoldingFeature) {
                    foldingFeature.getClass();
                    FoldingFeature foldingFeature2 = foldingFeature;
                    switch (foldingFeature2.getType()) {
                        case 1:
                            awpVar = awp.f2604a;
                            switch (foldingFeature2.getState()) {
                                case 1:
                                    awoVar = awo.f2601a;
                                    Rect bounds2 = foldingFeature2.getBounds();
                                    bounds2.getClass();
                                    avyVar = new avy(bounds2);
                                    Rect rectM2067c = awyVar.f2622a.m2067c();
                                    if ((avyVar.m2065a() == 0 || avyVar.m2066b() != 0) && ((avyVar.m2066b() == rectM2067c.width() || avyVar.m2065a() == rectM2067c.height()) && ((avyVar.m2066b() >= rectM2067c.width() || avyVar.m2065a() >= rectM2067c.height()) && (avyVar.m2066b() != rectM2067c.width() || avyVar.m2065a() != rectM2067c.height())))) {
                                        Rect bounds3 = foldingFeature2.getBounds();
                                        bounds3.getClass();
                                        awqVar = new awq(new avy(bounds3), awpVar, awoVar);
                                    }
                                    break;
                                case 2:
                                    awoVar = awo.f2602b;
                                    Rect bounds4 = foldingFeature2.getBounds();
                                    bounds4.getClass();
                                    avyVar = new avy(bounds4);
                                    Rect rectM2067c2 = awyVar.f2622a.m2067c();
                                    if (avyVar.m2065a() == 0) {
                                        Rect bounds5 = foldingFeature2.getBounds();
                                        bounds5.getClass();
                                        awqVar = new awq(new avy(bounds5), awpVar, awoVar);
                                    } else {
                                        Rect bounds6 = foldingFeature2.getBounds();
                                        bounds6.getClass();
                                        awqVar = new awq(new avy(bounds6), awpVar, awoVar);
                                    }
                                    break;
                            }
                            break;
                        case 2:
                            awpVar = awp.f2605b;
                            switch (foldingFeature2.getState()) {
                                case 1:
                                    awoVar = awo.f2601a;
                                    Rect bounds7 = foldingFeature2.getBounds();
                                    bounds7.getClass();
                                    avyVar = new avy(bounds7);
                                    Rect rectM2067c3 = awyVar.f2622a.m2067c();
                                    if (avyVar.m2065a() == 0) {
                                        Rect bounds8 = foldingFeature2.getBounds();
                                        bounds8.getClass();
                                        awqVar = new awq(new avy(bounds8), awpVar, awoVar);
                                    } else {
                                        Rect bounds9 = foldingFeature2.getBounds();
                                        bounds9.getClass();
                                        awqVar = new awq(new avy(bounds9), awpVar, awoVar);
                                    }
                                    break;
                                case 2:
                                    awoVar = awo.f2602b;
                                    Rect bounds10 = foldingFeature2.getBounds();
                                    bounds10.getClass();
                                    avyVar = new avy(bounds10);
                                    Rect rectM2067c4 = awyVar.f2622a.m2067c();
                                    if (avyVar.m2065a() == 0) {
                                        Rect bounds11 = foldingFeature2.getBounds();
                                        bounds11.getClass();
                                        awqVar = new awq(new avy(bounds11), awpVar, awoVar);
                                    } else {
                                        Rect bounds12 = foldingFeature2.getBounds();
                                        bounds12.getClass();
                                        awqVar = new awq(new avy(bounds12), awpVar, awoVar);
                                    }
                                    break;
                            }
                            break;
                    }
                }
                if (awqVar != null) {
                    arrayList.add(awqVar);
                }
            }
            this.f2630d = new awx(arrayList);
            Iterator it = this.f2628b.iterator();
            while (it.hasNext()) {
                ((aea) it.next()).mo309a(this.f2630d);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2081c(aea aeaVar) {
        ReentrantLock reentrantLock = this.f2627a;
        reentrantLock.lock();
        try {
            awx awxVar = this.f2630d;
            if (awxVar != null) {
                aeaVar.mo309a(awxVar);
            }
            this.f2628b.add(aeaVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
