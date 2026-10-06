package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Process;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class abx {
    /* JADX INFO: renamed from: b */
    public static int m170b(Context context, String str) {
        abe.m87b(str, "permission must be non-null");
        int i = adg.f162a;
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m171c(Context context, int i) {
        ColorStateList colorStateListM184a;
        Object objM193b;
        lqq lqqVar;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        ack ackVar = new ack(resources, theme2);
        synchronized (acn.f90c) {
            SparseArray sparseArray = (SparseArray) acn.f89b.get(ackVar);
            colorStateListM184a = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (lqqVar = (lqq) sparseArray.get(i)) == null) {
                objM193b = null;
            } else if (!((Configuration) lqqVar.f39002b).equals(ackVar.f86a.getConfiguration()) || (!((theme = ackVar.f87b) == null && lqqVar.f39001a == 0) && (theme == null || lqqVar.f39001a != theme.hashCode()))) {
                sparseArray.remove(i);
                objM193b = null;
            } else {
                objM193b = lqqVar.f39003c;
            }
        }
        if (objM193b == null) {
            TypedValue typedValue = (TypedValue) acn.f88a.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                acn.f88a.set(typedValue);
            }
            resources.getValue(i, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                try {
                    colorStateListM184a = ace.m184a(resources, resources.getXml(i), theme2);
                } catch (Exception e) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateListM184a != null) {
                synchronized (acn.f90c) {
                    SparseArray sparseArray2 = (SparseArray) acn.f89b.get(ackVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        acn.f89b.put(ackVar, sparseArray2);
                    }
                    sparseArray2.append(i, new lqq(colorStateListM184a, ackVar.f86a.getConfiguration(), theme2));
                }
                objM193b = colorStateListM184a;
            } else {
                objM193b = aci.m193b(resources, i, theme2);
            }
        }
        return (ColorStateList) objM193b;
    }

    /* JADX INFO: renamed from: d */
    public static File[] m172d(Context context) {
        return abs.m152b(context, null);
    }
}
