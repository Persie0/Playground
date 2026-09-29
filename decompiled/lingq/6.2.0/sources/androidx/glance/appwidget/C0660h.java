package androidx.glance.appwidget;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3192a;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C0785at;
import p000.C3386nv;
import p000.C3757xf;
import p000.c83;
import p000.cs4;
import p000.fa4;
import p000.hn3;
import p000.hr7;
import p000.in3;
import p000.u91;
import p000.v91;
import p000.xfa;

/* JADX INFO: renamed from: androidx.glance.appwidget.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0660h {

    /* JADX INFO: renamed from: f */
    public static DataStore f6013f;

    /* JADX INFO: renamed from: a */
    public final Context f6015a;

    /* JADX INFO: renamed from: b */
    public final AppWidgetManager f6016b;

    /* JADX INFO: renamed from: c */
    public final cs4 f6017c = AbstractC3192a.m15356a(new C3757xf(this, 14));

    /* JADX INFO: renamed from: d */
    public static final hn3 f6011d = new hn3();

    /* JADX INFO: renamed from: e */
    public static final hr7 f6012e = PreferenceDataStoreDelegateKt.preferencesDataStore$default("GlanceAppWidgetManager-" + Application.getProcessName(), null, null, null, 14, null);

    /* JADX INFO: renamed from: g */
    public static final Preferences.Key f6014g = PreferencesKeys.stringSetKey("list::Providers");

    public C0660h(Context context) {
        this.f6015a = context;
        this.f6016b = AppWidgetManager.getInstance(context);
    }

    /* JADX INFO: renamed from: a */
    public final Object m2238a(SuspendLambda suspendLambda) {
        String packageName = this.f6015a.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = this.f6016b.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedProviders) {
            if (fa4.m11650l(((AppWidgetProviderInfo) obj).provider.getPackageName(), packageName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
        }
        Object objUpdateData = ((DataStore) this.f6017c.getValue()).updateData(new GlanceAppWidgetManager$cleanReceivers$2(u91.m22627s1(arrayList2), null), suspendLambda);
        return objUpdateData == CoroutineSingletons.COROUTINE_SUSPENDED ? objUpdateData : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Serializable m2239b(Class cls, ContinuationImpl continuationImpl) throws Throwable {
        GlanceAppWidgetManager$getGlanceIds$1 glanceAppWidgetManager$getGlanceIds$1;
        if (continuationImpl instanceof GlanceAppWidgetManager$getGlanceIds$1) {
            glanceAppWidgetManager$getGlanceIds$1 = (GlanceAppWidgetManager$getGlanceIds$1) continuationImpl;
            int i = glanceAppWidgetManager$getGlanceIds$1.f5889d;
            if ((i & Integer.MIN_VALUE) != 0) {
                glanceAppWidgetManager$getGlanceIds$1.f5889d = i - Integer.MIN_VALUE;
            } else {
                glanceAppWidgetManager$getGlanceIds$1 = new GlanceAppWidgetManager$getGlanceIds$1(this, continuationImpl);
            }
        } else {
            glanceAppWidgetManager$getGlanceIds$1 = new GlanceAppWidgetManager$getGlanceIds$1(this, continuationImpl);
        }
        Object objM2240c = glanceAppWidgetManager$getGlanceIds$1.f5887b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = glanceAppWidgetManager$getGlanceIds$1.f5889d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2240c);
            glanceAppWidgetManager$getGlanceIds$1.f5886a = cls;
            glanceAppWidgetManager$getGlanceIds$1.f5889d = 1;
            objM2240c = m2240c(glanceAppWidgetManager$getGlanceIds$1);
            if (objM2240c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cls = glanceAppWidgetManager$getGlanceIds$1.f5886a;
            AbstractC3193b.m15359b(objM2240c);
        }
        in3 in3Var = (in3) objM2240c;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            C3386nv.m17626m("no canonical provider name");
            return null;
        }
        List list = (List) in3Var.f44303b.get(canonicalName);
        if (list == null) {
            return EmptyList.f47638a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int[] appWidgetIds = this.f6016b.getAppWidgetIds((ComponentName) it.next());
            ArrayList arrayList2 = new ArrayList(appWidgetIds.length);
            for (int i3 : appWidgetIds) {
                arrayList2.add(new C0785at(i3));
            }
            u91.m22630w0(arrayList2, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0133  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:0x015b  */
    /* JADX WARN: Code duplicated, block: B:64:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m2240c(ContinuationImpl continuationImpl) throws Throwable {
        GlanceAppWidgetManager$getState$1 glanceAppWidgetManager$getState$1;
        C0660h c0660h;
        Preferences preferences;
        C0660h c0660h2;
        String packageName;
        Set<String> set;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        Object arrayList2;
        ComponentName componentName;
        String str2;
        Pair pair;
        if (continuationImpl instanceof GlanceAppWidgetManager$getState$1) {
            glanceAppWidgetManager$getState$1 = (GlanceAppWidgetManager$getState$1) continuationImpl;
            int i = glanceAppWidgetManager$getState$1.f5893d;
            if ((i & Integer.MIN_VALUE) != 0) {
                glanceAppWidgetManager$getState$1.f5893d = i - Integer.MIN_VALUE;
            } else {
                glanceAppWidgetManager$getState$1 = new GlanceAppWidgetManager$getState$1(this, continuationImpl);
            }
        } else {
            glanceAppWidgetManager$getState$1 = new GlanceAppWidgetManager$getState$1(this, continuationImpl);
        }
        Object objM15541t = glanceAppWidgetManager$getState$1.f5891b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = glanceAppWidgetManager$getState$1.f5893d;
        cs4 cs4Var = this.f6017c;
        hn3 hn3Var = f6011d;
        Preferences.Key key = f6014g;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 data = ((DataStore) cs4Var.getValue()).getData();
            glanceAppWidgetManager$getState$1.f5890a = this;
            glanceAppWidgetManager$getState$1.f5893d = 1;
            objM15541t = AbstractC3224d.m15541t(data, glanceAppWidgetManager$getState$1);
            if (objM15541t != coroutineSingletons) {
                c0660h = this;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            c0660h = glanceAppWidgetManager$getState$1.f5890a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0660h2 = glanceAppWidgetManager$getState$1.f5890a;
            AbstractC3193b.m15359b(objM15541t);
        }
        preferences = (Preferences) objM15541t;
        c0660h = c0660h2;
        packageName = c0660h.f6015a.getPackageName();
        set = (Set) preferences.get(key);
        if (set == null) {
            return new in3(AbstractC3194a.m15360M(), AbstractC3194a.m15360M());
        }
        arrayList = new ArrayList();
        for (String str3 : set) {
            componentName = new ComponentName(packageName, str3);
            str2 = (String) preferences.get(hn3.m13377a(hn3Var, str3));
            if (str2 == null) {
                pair = null;
            } else {
                pair = new Pair(componentName, str2);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map mapM15370W = AbstractC3194a.m15370W(arrayList);
        Set<Map.Entry> setEntrySet = mapM15370W.entrySet();
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            str = (String) entry.getValue();
            arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((ComponentName) entry.getKey());
        }
        return new in3(mapM15370W, linkedHashMap);
        if (((Preferences) objM15541t).get(key) == null) {
            objM15541t = null;
        }
        preferences = (Preferences) objM15541t;
        if (preferences == null) {
            glanceAppWidgetManager$getState$1.f5890a = c0660h;
            glanceAppWidgetManager$getState$1.f5893d = 2;
            List<AppWidgetProviderInfo> installedProviders = this.f6016b.getInstalledProviders();
            ArrayList<AppWidgetProviderInfo> arrayList3 = new ArrayList();
            for (Object obj : installedProviders) {
                if (fa4.m11650l(((AppWidgetProviderInfo) obj).provider.getPackageName(), this.f6015a.getPackageName())) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (AppWidgetProviderInfo appWidgetProviderInfo : arrayList3) {
                hn3Var.getClass();
                Object objNewInstance = Class.forName(appWidgetProviderInfo.provider.getClassName()).getDeclaredConstructor(null).newInstance(null);
                AbstractC0661i abstractC0661i = objNewInstance instanceof AbstractC0661i ? (AbstractC0661i) objNewInstance : null;
                if (abstractC0661i != null) {
                    arrayList4.add(abstractC0661i);
                }
            }
            objM15541t = ((DataStore) cs4Var.getValue()).updateData(new C0646xc45dcaa4(arrayList4, null), glanceAppWidgetManager$getState$1);
            if (objM15541t != coroutineSingletons) {
                c0660h2 = c0660h;
                preferences = (Preferences) objM15541t;
                c0660h = c0660h2;
            }
            return coroutineSingletons;
        }
        packageName = c0660h.f6015a.getPackageName();
        set = (Set) preferences.get(key);
        if (set == null) {
            return new in3(AbstractC3194a.m15360M(), AbstractC3194a.m15360M());
        }
        arrayList = new ArrayList();
        while (r0.hasNext()) {
            componentName = new ComponentName(packageName, str3);
            str2 = (String) preferences.get(hn3.m13377a(hn3Var, str3));
            if (str2 == null) {
                pair = null;
            } else {
                pair = new Pair(componentName, str2);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map mapM15370W2 = AbstractC3194a.m15370W(arrayList);
        Set<Map.Entry> setEntrySet2 = mapM15370W2.entrySet();
        linkedHashMap = new LinkedHashMap();
        while (r0.hasNext()) {
            str = (String) entry.getValue();
            arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((ComponentName) entry.getKey());
        }
        return new in3(mapM15370W2, linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x0179  */
    /* JADX WARN: Code duplicated, block: B:55:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00db -> B:33:0x00eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x011e -> B:40:0x0123). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x015e -> B:49:0x0162). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0179 -> B:54:0x017d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public final java.lang.Object m2241d(p000.z21 r23, p000.u56 r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.C0660h.m2241d(z21, u56, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public final Object m2242e(AbstractC0661i abstractC0661i, AbstractC0659g abstractC0659g, Continuation continuation) {
        f6011d.getClass();
        String canonicalName = abstractC0661i.getClass().getCanonicalName();
        if (canonicalName == null) {
            C3386nv.m17626m("no receiver name");
            return null;
        }
        String canonicalName2 = abstractC0659g.getClass().getCanonicalName();
        if (canonicalName2 != null) {
            Object objUpdateData = ((DataStore) this.f6017c.getValue()).updateData(new GlanceAppWidgetManager$updateReceiver$2(canonicalName, canonicalName2, null), continuation);
            return objUpdateData == CoroutineSingletons.COROUTINE_SUSPENDED ? objUpdateData : xfa.f68157a;
        }
        C3386nv.m17626m("no provider name");
        return null;
    }
}
