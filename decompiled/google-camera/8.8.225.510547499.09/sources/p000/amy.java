package p000;

import android.media.MediaFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amy {

    /* JADX INFO: renamed from: a */
    public final MediaFormat f759a;

    /* JADX INFO: renamed from: b */
    public final int f760b;

    /* JADX INFO: renamed from: c */
    public final List f761c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List f762d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List f763e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final Deque f764f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public boolean f765g = false;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ amz f766h;

    public amy(amz amzVar, MediaFormat mediaFormat, int i) {
        this.f766h = amzVar;
        this.f759a = mediaFormat;
        this.f760b = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m980a() {
        return acm.m204c(this.f759a) ? 48000 : 90000;
    }

    /* JADX INFO: renamed from: b */
    public final mws m981b() {
        return mws.m17095j(this.f761c);
    }
}
