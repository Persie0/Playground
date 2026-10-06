package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lse {

    /* JADX INFO: renamed from: a */
    public static final Pattern f39128a = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* JADX INFO: renamed from: b */
    static final Account f39129b = lsb.f39117a;

    /* JADX INFO: renamed from: c */
    public static final Set f39130c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));

    /* JADX INFO: renamed from: d */
    public static final Set f39131d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));

    /* JADX INFO: renamed from: a */
    public static lsd m15942a(Context context) {
        return new lsd(context);
    }
}
