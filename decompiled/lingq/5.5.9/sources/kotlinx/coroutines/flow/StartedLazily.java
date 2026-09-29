package kotlinx.coroutines.flow;

/* JADX INFO: loaded from: classes2.dex */
public final class StartedLazily implements InterfaceC7140u {
    @Override // kotlinx.coroutines.flow.InterfaceC7140u
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<SharingCommand> mo14363a(InterfaceC7142w<Integer> interfaceC7142w) {
        return new C7136q(new StartedLazily$command$1(interfaceC7142w, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
