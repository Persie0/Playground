package p000;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class rgd {

    /* JADX INFO: renamed from: a */
    public static final Pattern f59246a = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* JADX INFO: renamed from: b */
    public static final Account f59247b = fgd.f39096a;

    /* JADX INFO: renamed from: c */
    public static final Set f59248c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));

    /* JADX INFO: renamed from: d */
    public static final Set f59249d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}
