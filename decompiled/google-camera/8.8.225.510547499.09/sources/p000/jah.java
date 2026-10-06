package p000;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jah {

    /* JADX INFO: renamed from: a */
    public final izv f33564a;

    /* JADX INFO: renamed from: b */
    public volatile Boolean f33565b;

    /* JADX INFO: renamed from: c */
    private String f33566c;

    /* JADX INFO: renamed from: d */
    private Set f33567d;

    protected jah(izv izvVar) {
        this.f33564a = izvVar;
    }

    /* JADX INFO: renamed from: b */
    public static final long m12771b() {
        return ((Long) jam.f33583e.m11334D()).longValue();
    }

    /* JADX INFO: renamed from: c */
    public static final long m12772c() {
        return ((Long) jam.f33582d.m11334D()).longValue();
    }

    /* JADX INFO: renamed from: d */
    public static final int m12773d() {
        return ((Integer) jam.f33586h.m11334D()).intValue();
    }

    /* JADX INFO: renamed from: e */
    public static final int m12774e() {
        return ((Integer) jam.f33585g.m11334D()).intValue();
    }

    /* JADX INFO: renamed from: f */
    public static final String m12775f() {
        return (String) jam.f33588j.m11334D();
    }

    /* JADX INFO: renamed from: g */
    public static final String m12776g() {
        return (String) jam.f33589k.m11334D();
    }

    /* JADX INFO: renamed from: h */
    public static final String m12777h() {
        return (String) jam.f33587i.m11334D();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m12778i() {
        return ((Boolean) jam.f33579a.m11334D()).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final Set m12779a() {
        String str;
        String str2 = (String) jam.f33597s.m11334D();
        if (this.f33567d == null || (str = this.f33566c) == null || !str.equals(str2)) {
            String[] strArrSplit = TextUtils.split(str2, ",");
            HashSet hashSet = new HashSet();
            for (String str3 : strArrSplit) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str3)));
                } catch (NumberFormatException e) {
                }
            }
            this.f33566c = str2;
            this.f33567d = hashSet;
        }
        return this.f33567d;
    }
}
