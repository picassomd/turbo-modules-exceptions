import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  nonVoidFunction(): boolean;
  voidFunction(): void;
}

export default TurboModuleRegistry.getEnforcing<Spec>('NativeExceptionTest');
