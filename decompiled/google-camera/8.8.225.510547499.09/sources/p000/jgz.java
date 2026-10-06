package p000;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jgz {

    /* JADX INFO: renamed from: a */
    public final Account f34014a;

    /* JADX INFO: renamed from: b */
    public final Set f34015b;

    /* JADX INFO: renamed from: c */
    public final Set f34016c;

    /* JADX INFO: renamed from: d */
    public final Map f34017d;

    /* JADX INFO: renamed from: e */
    public final String f34018e;

    /* JADX INFO: renamed from: f */
    public final String f34019f;

    /* JADX INFO: renamed from: g */
    public final jov f34020g;

    /* JADX INFO: renamed from: h */
    public Integer f34021h;

    public jgz(Account account, Set set, String str, String str2, jov jovVar) {
        this.f34014a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f34015b = setEmptySet;
        Map mapEmptyMap = Collections.emptyMap();
        this.f34017d = mapEmptyMap;
        this.f34018e = str;
        this.f34019f = str2;
        this.f34020g = jovVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        while (it.hasNext()) {
            Object obj = ((khb) it.next()).f36008a;
            hashSet.addAll(null);
        }
        this.f34016c = Collections.unmodifiableSet(hashSet);
    }
}
