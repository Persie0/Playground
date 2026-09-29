package com.lingq.p055ui.imports.userImport;

import android.os.Parcelable;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.UserImportDetailType;
import dm.C5207g;
import fj.C5546g;
import fj.InterfaceC5547h;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Triple;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.scheduling.ExecutorC7177a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/imports/userImport/UserImportAddCourseViewModel;", "Landroidx/lifecycle/h0;", "Lfj/h;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserImportAddCourseViewModel extends AbstractC1036h0 implements InterfaceC5547h {

    /* JADX INFO: renamed from: d */
    public final CoroutineDispatcher f26574d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC5547h f26575e;

    /* JADX INFO: renamed from: f */
    public final UserImportDetailType f26576f;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public UserImportAddCourseViewModel(ExecutorC7177a executorC7177a, C1024c0 c1024c0, InterfaceC5547h interfaceC5547h) {
        C5207g.m11111f(c1024c0, "savedStateHandle");
        C5207g.m11111f(interfaceC5547h, "userImportDelegate");
        this.f26574d = executorC7177a;
        this.f26575e = interfaceC5547h;
        if (!c1024c0.f6616a.containsKey("userImportDetailType")) {
            throw new IllegalArgumentException("Required argument \"userImportDetailType\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(UserImportDetailType.class) && !Serializable.class.isAssignableFrom(UserImportDetailType.class)) {
            throw new UnsupportedOperationException(UserImportDetailType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        UserImportDetailType userImportDetailType = (UserImportDetailType) c1024c0.m3929b("userImportDetailType");
        if (userImportDetailType == null) {
            throw new IllegalArgumentException("Argument \"userImportDetailType\" is marked as non-null but was passed a null value");
        }
        this.f26576f = userImportDetailType;
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: C */
    public final InterfaceC7137r<UserImportDetailType> mo10075C() {
        return this.f26575e.mo10075C();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: F */
    public final InterfaceC7137r<Integer> mo10076F() {
        return this.f26575e.mo10076F();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: K1 */
    public final void mo10077K1() {
        this.f26575e.mo10077K1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: P0 */
    public final void mo10078P0(Triple<? extends UserImportDetailType, String, Boolean> triple) {
        this.f26575e.mo10078P0(triple);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: R */
    public final InterfaceC7137r<Boolean> mo10079R() {
        return this.f26575e.mo10079R();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: T1 */
    public final InterfaceC7142w<C5546g> mo10080T1() {
        return this.f26575e.mo10080T1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: V1 */
    public final void mo10081V1(int i10) {
        this.f26575e.mo10081V1(i10);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: c2 */
    public final InterfaceC7137r<Boolean> mo10082c2() {
        return this.f26575e.mo10082c2();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: e */
    public final void mo10083e(UserImportDetailType userImportDetailType) {
        C5207g.m11111f(userImportDetailType, "userImportDetailType");
        this.f26575e.mo10083e(userImportDetailType);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: o1 */
    public final InterfaceC7137r<Triple<UserImportDetailType, String, Boolean>> mo10084o1() {
        return this.f26575e.mo10084o1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: v0 */
    public final void mo10085v0(C5546g c5546g) {
        this.f26575e.mo10085v0(c5546g);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: w */
    public final void mo10086w() {
        this.f26575e.mo10086w();
    }
}
