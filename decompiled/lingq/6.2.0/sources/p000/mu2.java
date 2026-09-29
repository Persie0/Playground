package p000;

import com.amplitude.core.utilities.C0913a;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mu2 implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51848a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0913a f51849b;

    public /* synthetic */ mu2(C0913a c0913a, int i) {
        this.f51848a = i;
        this.f51849b = c0913a;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.f51848a;
        C0913a c0913a = this.f51849b;
        switch (i) {
            case 0:
                c0913a.getClass();
                str.getClass();
                return (!vk9.m23380c0(str, c0913a.f11252b, false) || cl9.m4833P(str, ".tmp", false) || cl9.m4833P(str, ".properties", false)) ? false : true;
            case 1:
                str.getClass();
                return vk9.m23380c0(str, c0913a.f11252b, false) && cl9.m4833P(str, ".tmp", false);
            default:
                str.getClass();
                return vk9.m23380c0(str, c0913a.f11252b, false) && !cl9.m4833P(str, ".properties", false);
        }
    }
}
