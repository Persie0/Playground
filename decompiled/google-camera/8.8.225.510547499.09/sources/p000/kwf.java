package p000;

import android.os.Build;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwf {

    /* JADX INFO: renamed from: a */
    public static final boolean f37503a;

    /* JADX INFO: renamed from: b */
    public static final kwt f37504b;

    /* JADX INFO: renamed from: c */
    private static final List f37505c;

    static {
        boolean zM14939c = kwg.m14939c();
        f37503a = zM14939c;
        kwg.m14940d();
        if (!kwg.m14937a()) {
            kwg.m14938b();
        }
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("GM1900", voNZjxiJou.azRijT, "GM1903", "GM1905", "GM1910", "GM1911", "GM1913", "GM1917", "GM1915", "GM1920", "GM1925", "SS8821", "SS8831", "SS8827", "SS8857", "HD1910", "HD1911", "HD1913", "HD1917", "HD1900", "HD1901", "HD1903", "HD1905", "HD1907", "HD1925", "IN2020", "IN2021", "IN2023", "IN2025", "IN2010", "IN2011", "IN2013", "IN2015", "IN2017", "IN2019"));
        f37505c = listUnmodifiableList;
        if (!kwg.m14939c()) {
            listUnmodifiableList.contains(Build.MODEL);
        }
        if (!kwg.m14938b() && !kwg.m14937a()) {
            kwg.m14941e();
        }
        if (!kwg.m14938b() && !kwg.m14937a()) {
            kwg.m14941e();
        }
        if (!kwg.m14938b()) {
            kwg.m14937a();
        }
        if (!kwg.m14938b()) {
            kwg.m14937a();
        }
        if (!kwg.m14938b()) {
            kwg.m14937a();
        }
        if (zM14939c) {
            kwg.m14941e();
        }
        if (!zM14939c) {
            kwg.m14941e();
        }
        if (!zM14939c) {
            kwg.m14941e();
        }
        listUnmodifiableList.contains(Build.MODEL);
        f37504b = (kwg.m14937a() || kwg.m14938b()) ? kwt.ENABLED : kwt.DISABLED;
        if (!kwg.m14937a() && !kwg.m14938b()) {
            kwg.m14941e();
        }
        kwg.m14940d();
    }
}
