package androidx.view;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/o;", "lifecycle-common"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DefaultLifecycleObserverAdapter implements InterfaceC1049o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1029e f6516a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1049o f6517b;

    /* JADX INFO: renamed from: androidx.lifecycle.DefaultLifecycleObserverAdapter$a */
    public /* synthetic */ class C1007a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6518a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f6518a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(InterfaceC1029e interfaceC1029e, InterfaceC1049o interfaceC1049o) {
        C5207g.m11111f(interfaceC1029e, "defaultLifecycleObserver");
        this.f6516a = interfaceC1029e;
        this.f6517b = interfaceC1049o;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.view.InterfaceC1049o
    /* JADX INFO: renamed from: e */
    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
        int i10 = C1007a.f6518a[event.ordinal()];
        InterfaceC1029e interfaceC1029e = this.f6516a;
        switch (i10) {
            case 1:
                interfaceC1029e.mo3933c(interfaceC1051q);
                break;
            case 2:
                interfaceC1029e.onStart(interfaceC1051q);
                break;
            case 3:
                interfaceC1029e.mo2261b(interfaceC1051q);
                break;
            case 4:
                interfaceC1029e.getClass();
                break;
            case 5:
                interfaceC1029e.onStop(interfaceC1051q);
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                interfaceC1029e.onDestroy(interfaceC1051q);
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1049o interfaceC1049o = this.f6517b;
        if (interfaceC1049o != null) {
            interfaceC1049o.mo800e(interfaceC1051q, event);
        }
    }
}
