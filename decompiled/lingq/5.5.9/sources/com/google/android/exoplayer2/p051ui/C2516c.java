package com.google.android.exoplayer2.p051ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import p134g8.C5715b;
import p166i1.C6161p;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2516c {

    /* JADX INFO: renamed from: a */
    public static final Pattern f13559a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final String f13560a;

        /* JADX INFO: renamed from: b */
        public final Map<String, String> f13561b;

        public a(String str, Map map) {
            this.f13560a = str;
            this.f13561b = map;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.c$b */
    public static final class b {

        /* JADX INFO: renamed from: e */
        public static final C6161p f13562e = new C6161p(3);

        /* JADX INFO: renamed from: f */
        public static final C5715b f13563f = new C5715b(7);

        /* JADX INFO: renamed from: a */
        public final int f13564a;

        /* JADX INFO: renamed from: b */
        public final int f13565b;

        /* JADX INFO: renamed from: c */
        public final String f13566c;

        /* JADX INFO: renamed from: d */
        public final String f13567d;

        public b(int i10, int i11, String str, String str2) {
            this.f13564a = i10;
            this.f13565b = i11;
            this.f13566c = str;
            this.f13567d = str2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.c$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final ArrayList f13568a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final ArrayList f13569b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static String m7429a(CharSequence charSequence) {
        return f13559a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
