package p450w6;

import java.util.HashSet;
import java.util.Iterator;
import p290o6.C7979r0;
import p290o6.InterfaceC7984w;

/* JADX INFO: renamed from: w6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9815b {

    /* JADX INFO: renamed from: a */
    public final HashSet<String> f49959a;

    public C9815b(HashSet<String> hashSet) {
        HashSet<String> hashSet2 = new HashSet<>();
        this.f49959a = hashSet2;
        hashSet2.addAll(hashSet);
    }

    public C9815b(String[] strArr) {
        this.f49959a = new HashSet<>();
        if (strArr != null && strArr.length > 0) {
            for (String string : strArr) {
                if (C7979r0.m15834a(string, InterfaceC7984w.f43430c)) {
                    if (string != null && !string.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder();
                        boolean z10 = true;
                        for (char lowerCase : string.toCharArray()) {
                            if (Character.isSpaceChar(lowerCase)) {
                                z10 = true;
                            } else if (z10) {
                                lowerCase = Character.toTitleCase(lowerCase);
                                z10 = false;
                            } else {
                                lowerCase = Character.toLowerCase(lowerCase);
                            }
                            sb2.append(lowerCase);
                        }
                        string = sb2.toString();
                    }
                    this.f49959a.add(string);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9815b.class != obj.getClass()) {
            return false;
        }
        return this.f49959a.equals(((C9815b) obj).f49959a);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f49959a.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (InterfaceC7984w.f43430c.contains(next)) {
                sb2.append(next);
                sb2.append(it.hasNext() ? "," : "");
            }
        }
        return sb2.toString();
    }
}
