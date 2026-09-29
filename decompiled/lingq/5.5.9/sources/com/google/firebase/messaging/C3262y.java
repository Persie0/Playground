package com.google.firebase.messaging;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;
import p003a2.C0009a;

/* JADX INFO: renamed from: com.google.firebase.messaging.y */
/* JADX INFO: loaded from: classes.dex */
public final class C3262y {

    /* JADX INFO: renamed from: d */
    public static final Pattern f16456d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a */
    public final String f16457a;

    /* JADX INFO: renamed from: b */
    public final String f16458b;

    /* JADX INFO: renamed from: c */
    public final String f16459c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C3262y(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f16456d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f16457a = strSubstring;
        this.f16458b = str;
        this.f16459c = C0009a.m21i(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof C3262y)) {
            return false;
        }
        C3262y c3262y = (C3262y) obj;
        if (this.f16457a.equals(c3262y.f16457a) && this.f16458b.equals(c3262y.f16458b)) {
            z10 = true;
        }
        return z10;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16458b, this.f16457a});
    }
}
