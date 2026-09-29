package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.preferences.core.C0802a;
import androidx.datastore.preferences.core.PreferenceDataStore;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.io.File;
import java.util.List;
import km.InterfaceC6727j;
import no.InterfaceC7882z;
import p129g3.InterfaceC5686c;
import p212k3.AbstractC6579a;

/* JADX INFO: renamed from: androidx.datastore.preferences.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0799a {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<Context, List<InterfaceC5686c<AbstractC6579a>>> f5778b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7882z f5779c;

    /* JADX INFO: renamed from: e */
    public volatile PreferenceDataStore f5781e;

    /* JADX INFO: renamed from: a */
    public final String f5777a = "com.linguist_preferences";

    /* JADX INFO: renamed from: d */
    public final Object f5780d = new Object();

    public C0799a(InterfaceC2052l interfaceC2052l, InterfaceC7882z interfaceC7882z) {
        this.f5778b = interfaceC2052l;
        this.f5779c = interfaceC7882z;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final Object m3043a(Object obj, InterfaceC6727j interfaceC6727j) {
        PreferenceDataStore preferenceDataStore;
        Context context = (Context) obj;
        C5207g.m11111f(interfaceC6727j, "property");
        PreferenceDataStore preferenceDataStore2 = this.f5781e;
        if (preferenceDataStore2 != null) {
            return preferenceDataStore2;
        }
        synchronized (this.f5780d) {
            if (this.f5781e == null) {
                final Context applicationContext = context.getApplicationContext();
                InterfaceC2052l<Context, List<InterfaceC5686c<AbstractC6579a>>> interfaceC2052l = this.f5778b;
                C5207g.m11110e(applicationContext, "applicationContext");
                this.f5781e = C0802a.m3055a(interfaceC2052l.mo528n(applicationContext), this.f5779c, new InterfaceC2041a<File>() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final File mo807E() {
                        Context context2 = applicationContext;
                        C5207g.m11110e(context2, "applicationContext");
                        String str = this.f5777a;
                        C5207g.m11111f(str, "name");
                        String strM11116k = C5207g.m11116k(".preferences_pb", str);
                        C5207g.m11111f(strM11116k, "fileName");
                        return new File(context2.getApplicationContext().getFilesDir(), C5207g.m11116k(strM11116k, "datastore/"));
                    }
                });
            }
            preferenceDataStore = this.f5781e;
            C5207g.m11108c(preferenceDataStore);
        }
        return preferenceDataStore;
    }
}
