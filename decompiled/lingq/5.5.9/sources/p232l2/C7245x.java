package p232l2;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p254m2.C7472a;

/* JADX INFO: renamed from: l2.x */
/* JADX INFO: loaded from: classes.dex */
public final class C7245x implements Iterable<Intent> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Intent> f40687a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final Context f40688b;

    /* JADX INFO: renamed from: l2.x$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static PendingIntent m14589a(Context context, int i10, Intent[] intentArr, int i11, Bundle bundle) {
            return PendingIntent.getActivities(context, i10, intentArr, i11, bundle);
        }
    }

    public C7245x(Context context) {
        this.f40688b = context;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m14587a(ComponentName componentName) {
        Context context = this.f40688b;
        ArrayList<Intent> arrayList = this.f40687a;
        int size = arrayList.size();
        try {
            for (Intent intentM14563b = C7232k.m14563b(context, componentName); intentM14563b != null; intentM14563b = C7232k.m14563b(context, intentM14563b.getComponent())) {
                arrayList.add(size, intentM14563b);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14588f() {
        ArrayList<Intent> arrayList = this.f40687a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Object obj = C7472a.f41322a;
        C7472a.a.m14843a(this.f40688b, intentArr, null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f40687a.iterator();
    }
}
