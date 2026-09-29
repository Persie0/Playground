package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p196ja.AbstractC6440c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.d */
/* JADX INFO: loaded from: classes.dex */
public class C2491d extends AbstractC6440c {

    /* JADX INFO: renamed from: n */
    public static final C2491d f13269n = new C2491d("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: d */
    public final List<Uri> f13270d;

    /* JADX INFO: renamed from: e */
    public final List<b> f13271e;

    /* JADX INFO: renamed from: f */
    public final List<a> f13272f;

    /* JADX INFO: renamed from: g */
    public final List<a> f13273g;

    /* JADX INFO: renamed from: h */
    public final List<a> f13274h;

    /* JADX INFO: renamed from: i */
    public final List<a> f13275i;

    /* JADX INFO: renamed from: j */
    public final C2416m f13276j;

    /* JADX INFO: renamed from: k */
    public final List<C2416m> f13277k;

    /* JADX INFO: renamed from: l */
    public final Map<String, String> f13278l;

    /* JADX INFO: renamed from: m */
    public final List<DrmInitData> f13279m;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Uri f13280a;

        /* JADX INFO: renamed from: b */
        public final C2416m f13281b;

        /* JADX INFO: renamed from: c */
        public final String f13282c;

        public a(Uri uri, C2416m c2416m, String str) {
            this.f13280a = uri;
            this.f13281b = c2416m;
            this.f13282c = str;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Uri f13283a;

        /* JADX INFO: renamed from: b */
        public final C2416m f13284b;

        /* JADX INFO: renamed from: c */
        public final String f13285c;

        /* JADX INFO: renamed from: d */
        public final String f13286d;

        /* JADX INFO: renamed from: e */
        public final String f13287e;

        /* JADX INFO: renamed from: f */
        public final String f13288f;

        public b(Uri uri, C2416m c2416m, String str, String str2, String str3, String str4) {
            this.f13283a = uri;
            this.f13284b = c2416m;
            this.f13285c = str;
            this.f13286d = str2;
            this.f13287e = str3;
            this.f13288f = str4;
        }
    }

    public C2491d(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, C2416m c2416m, List<C2416m> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z10);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = list2.get(i10).f13283a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m7322b(list3, arrayList);
        m7322b(list4, arrayList);
        m7322b(list5, arrayList);
        m7322b(list6, arrayList);
        this.f13270d = Collections.unmodifiableList(arrayList);
        this.f13271e = Collections.unmodifiableList(list2);
        this.f13272f = Collections.unmodifiableList(list3);
        this.f13273g = Collections.unmodifiableList(list4);
        this.f13274h = Collections.unmodifiableList(list5);
        this.f13275i = Collections.unmodifiableList(list6);
        this.f13276j = c2416m;
        this.f13277k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f13278l = Collections.unmodifiableMap(map);
        this.f13279m = Collections.unmodifiableList(list8);
    }

    /* JADX INFO: renamed from: b */
    public static void m7322b(List list, ArrayList arrayList) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((a) list.get(i10)).f13280a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m7323c(int i10, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                StreamKey streamKey = (StreamKey) list2.get(i12);
                if (streamKey.f12762b == i10 && streamKey.f12763c == i11) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // p114fa.InterfaceC5483a
    /* JADX INFO: renamed from: a */
    public final AbstractC6440c mo7321a(List list) {
        return new C2491d(this.f36989a, this.f36990b, m7323c(0, this.f13271e, list), Collections.emptyList(), m7323c(1, this.f13273g, list), m7323c(2, this.f13274h, list), Collections.emptyList(), this.f13276j, this.f13277k, this.f36991c, this.f13278l, this.f13279m);
    }
}
