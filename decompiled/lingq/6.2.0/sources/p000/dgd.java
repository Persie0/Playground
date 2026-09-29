package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzsk;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class dgd {

    /* JADX INFO: renamed from: a */
    public final HashMap f35636a;

    /* JADX INFO: renamed from: b */
    public final HashMap f35637b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f35638c;

    public dgd(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.f35636a = new HashMap();
        this.f35637b = new HashMap();
        this.f35638c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uid uidVar = (uid) it.next();
            if (TextUtils.isEmpty(uidVar.mo14449c())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                uid uidVar2 = (uid) this.f35636a.put(uidVar.mo14449c(), uidVar);
                if (uidVar2 != null) {
                    String canonicalName = uidVar2.getClass().getCanonicalName();
                    String canonicalName2 = uidVar.getClass().getCanonicalName();
                    C3386nv.m17626m(wq1.m24125u(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw wq1.m24110f(it2);
        }
        this.f35638c.addAll(list);
    }

    /* JADX INFO: renamed from: a */
    public final Object m10371a(Uri uri, agd agdVar) {
        return agdVar.mo391b(m10372b(uri));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final ny8 m10372b(Uri uri) throws zzsk {
        c14 c14VarM6284m = ImmutableList.m6284m();
        c14 c14VarM6284m2 = ImmutableList.m6284m();
        String encodedFragment = uri.getEncodedFragment();
        ImmutableList immutableListM6289v = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? ImmutableList.m6289v() : ImmutableList.m6286o(kg0.m15170c("+").m15172b().m15173d(encodedFragment.substring(10)));
        int size = immutableListM6289v.size();
        for (int i = 0; i < size; i++) {
            String str = (String) immutableListM6289v.get(i);
            Matcher matcher = aid.f721a.matcher(str);
            if (!matcher.matches()) {
                C3386nv.m17626m("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            c14VarM6284m2.m3157b(matcher.group(1));
        }
        ImmutableList immutableListM4280g = c14VarM6284m2.m4280g();
        if (immutableListM4280g.size() > 0) {
            String str2 = (String) immutableListM4280g.get(0);
            if (this.f35637b.get(str2) != null) {
                ho2.m13383c();
                return null;
            }
            String strValueOf = String.valueOf(uri);
            throw new zzsk(wq1.m24125u(new StringBuilder(String.valueOf(str2).length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
        }
        ImmutableList immutableListMo6292D = c14VarM6284m.m4280g().mo6292D();
        w41 w41Var = new w41();
        String scheme = uri.getScheme();
        uid uidVar = (uid) this.f35636a.get(scheme);
        if (uidVar == null) {
            throw new zzsk(AbstractC3393o1.m17734i("Requested backend isn't registered: ", scheme));
        }
        w41Var.f66365a = uidVar;
        w41Var.f66367c = this.f35638c;
        w41Var.f66366b = immutableListMo6292D;
        w41Var.f66368d = uri;
        if (!immutableListMo6292D.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator<E> listIterator = immutableListMo6292D.listIterator(immutableListMo6292D.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        ho2.m13383c();
                        return null;
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        w41Var.f66369e = uri;
        return new ny8(w41Var);
    }
}
