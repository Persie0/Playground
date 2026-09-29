package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.eh0;
import p000.hr7;
import p000.nn9;
import p000.ph2;
import p000.r46;
import p000.t62;
import p000.un1;
import p000.v72;
import p000.vi3;
import p000.vp6;
import p000.vz1;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreDelegateKt {
    public static final hr7 preferencesDataStore(String str, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, vi3 vi3Var, un1 un1Var) {
        str.getClass();
        vi3Var.getClass();
        un1Var.getClass();
        return new PreferenceDataStoreSingletonDelegate(str, replaceFileCorruptionHandler, vi3Var, un1Var);
    }

    public static hr7 preferencesDataStore$default(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, vi3 vi3Var, un1 un1Var, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            vi3Var = new vp6(6);
        }
        if ((i & 8) != 0) {
            v72 v72Var = ph2.f56212a;
            t62 t62Var = t62.f61909c;
            nn9 nn9VarM20384i = r46.m20384i();
            t62Var.getClass();
            un1Var = vz1.m23619a(eh0.m11113J(t62Var, nn9VarM20384i));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, vi3Var, un1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List preferencesDataStore$lambda$0(Context context) {
        context.getClass();
        return EmptyList.f47638a;
    }
}
