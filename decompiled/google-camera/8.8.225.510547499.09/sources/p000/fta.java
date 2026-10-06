package p000;

import android.graphics.Bitmap;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.SpatialGainMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fta {

    /* JADX INFO: renamed from: a */
    public final int f23535a;

    /* JADX INFO: renamed from: b */
    public final Object f23536b;

    /* JADX INFO: renamed from: c */
    public final Object f23537c;

    /* JADX INFO: renamed from: d */
    public final Object f23538d;

    public fta(ShotMetadata shotMetadata, int i, AeShotParams aeShotParams, SpatialGainMap spatialGainMap) {
        this.f23536b = shotMetadata;
        this.f23535a = i;
        this.f23537c = aeShotParams;
        this.f23538d = spatialGainMap;
    }

    public fta(List list, List list2, Bitmap bitmap, int i) {
        this.f23538d = list;
        this.f23536b = list2;
        this.f23537c = bitmap;
        this.f23535a = i;
    }
}
