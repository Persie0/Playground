package androidx.compose.p017ui.focus;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p351r0.InterfaceC8697p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m13365d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "Lr0/p;", "", "isFocused", "()Z", "getHasFocus", "hasFocus", "isCaptured", "<init>", "(Ljava/lang/String;I)V", "Active", "ActiveParent", "Captured", "Inactive", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public enum FocusStateImpl implements InterfaceC8697p {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusStateImpl$a */
    public /* synthetic */ class C0505a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3391a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3391a = iArr;
        }
    }

    @Override // p351r0.InterfaceC8697p
    public boolean getHasFocus() {
        int i10 = C0505a.f3391a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean isCaptured() {
        int i10 = C0505a.f3391a[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2 && i10 != 3 && i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    @Override // p351r0.InterfaceC8697p
    public boolean isFocused() {
        int i10 = C0505a.f3391a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
